package org.example;
import java.util.Scanner;
public class Banco {

    // Atributos
    PilhaObj<Operacao> pilhaOperacao = new PilhaObj(10);
    FilaObj<Operacao> filaOperacao = new FilaObj(10);
    // Contador de operações empilhadas
    Integer contadorOperacao = 0;

    ContaBancaria conta1 = new ContaBancaria(1, 1000.0);
    ContaBancaria conta2 = new ContaBancaria(2, 2000.0);

    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    // Métodos

    /* Método debitar - recebe o valor a ser debitado e o objeto conta bancária
       Se o débito ocorreu com sucesso, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void debitar(Double valor, ContaBancaria conta) {
        conta.debitar(valor);
        Operacao operacao = new Operacao(conta, "debitar", valor);
        pilhaOperacao.push(operacao);
        contadorOperacao++;
    }

    /* Método creditar - recebe o valor a ser depositado e o objeto conta bancária
       Executa o depósito, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void creditar(Double valor, ContaBancaria conta) {
        conta.creditar(valor);
        Operacao operacao = new Operacao(conta, "creditar", valor);
        pilhaOperacao.push(operacao);
        contadorOperacao++;
    }

    /* Método desfazerOperacao - recebe a quantidade de operações a serem desfeitas
       Se essa quantidade for inválida, lança IllegalArgumentException
       Senão, "desfaz" a quantidade de operações passadas como argumento
       e atualiza o contadorOperacao
     */
    public void desfazerOperacao(Integer qtdOperacaoDesfeita) {
        if (qtdOperacaoDesfeita == null || qtdOperacaoDesfeita <= 0 || qtdOperacaoDesfeita > contadorOperacao) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        for (int i = 0; i < qtdOperacaoDesfeita; i++) {
            Operacao operacao = pilhaOperacao.pop();
            if (operacao.getTipoOperacao().equals("debitar")) {
                creditar(operacao.getValor(), operacao.getContaBancaria());
            } else {
                debitar(operacao.getValor(), operacao.getContaBancaria());
            }
        }
        contadorOperacao -= qtdOperacaoDesfeita;
    }


    /* Método agendarOperacao - recebe o tipo da operaçõa, o valor e o objeto conta bancária
       Se um dos argumentos for inválido, lança IllegalArgumentException.
       Senão, cria um objeto Operacao e insere esse objeto na fila.
    */
    public void agendarOperacao(String tipoOperacao, Double valor, ContaBancaria conta) {
        if (tipoOperacao == null || (!tipoOperacao.equals("debitar") && !tipoOperacao.equals("creditar")) || valor == null || valor <= 0 || conta == null) {
            throw new IllegalArgumentException("Argumento inválido");
        }
        Operacao operacao = new Operacao(conta, tipoOperacao, valor);
        filaOperacao.insert(operacao);
    }

    /* Método executarOperacoesAgendadas
       Se não houver operações na fila, exibe mensagem de que não há operações agendadas.
       Senão, esvazia a fila, executando cada uma das operações agendadas.
    */
    public void executarOperacoesAgendadas() {
        if (filaOperacao.isEmpty()) {
            System.out.println("Não há operações agendadas");
        } else {
            while (!filaOperacao.isEmpty()) {
                Operacao operacao = filaOperacao.poll();
                if (operacao.getTipoOperacao().equals("debitar")) {
                    debitar(operacao.getValor(), operacao.getContaBancaria());
                } else {
                    creditar(operacao.getValor(), operacao.getContaBancaria());
                }
            }
        }
    }

    // Gettens
    public PilhaObj<Operacao> getPilhaOperacao() {
        return null;
    }

    public FilaObj<Operacao> getFilaOperacao() {
        return null;
    }

    public Integer getContadorOperacao() {
        return null;
    }
}
