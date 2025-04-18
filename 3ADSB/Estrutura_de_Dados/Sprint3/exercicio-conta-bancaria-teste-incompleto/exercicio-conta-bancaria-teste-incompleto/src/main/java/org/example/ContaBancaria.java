package org.example;
public class ContaBancaria {

    // Atributos
    private Integer numero;
    private Double saldo;

    // Construtor
    public ContaBancaria(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // Métodos

    /* Método debitar - recebe o valor a ser debitado
       Se o valor for inválido, deve lançar IllegalArgumentException
       Se o saldo for insuficiente para o débito, retorna false
       Senão, atualiza o saldo e retorna true
     */

    public Boolean debitar(Double valor) {
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        else if(saldo == null || saldo <= 0){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        else{
            saldo -= valor;
            System.out.println("Saldo após débito: " + saldo);
            return true;
        }
    }

    /* Método creditar - recebe o valor a ser depositado
       Se o valor for inválido, deve lançar IllegalArgumentException
       Senão, atualiza o saldo
     */
    public void creditar(Double valor){
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        saldo += valor;
        System.out.println("Saldo após crédito: " + saldo);
    }


    /* Método toString() - retorna uma String formatada com o número e o saldo da conta. */
    @Override
    public String toString() {
        return null;
    }

    // Getters
    public Integer getNumero() {
        return null;
    }

    public Double getSaldo() {
        return null;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
