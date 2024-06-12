import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private List<ContaBancaria> contas;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public void exibirContaCorrenteComMenorLimiteChequeEspecial() {
        Double menorCredito = 0.0;
        ContaCorrente contaEncontrada = null;
        for (ContaBancaria contaBancariaDaVez : contas) {
            if(contaBancariaDaVez instanceof ContaBancaria){
                ContaCorrente contaCorrenteDaVez = (ContaCorrente) contaBancariaDaVez;
                if(contaCorrenteDaVez.getLimiteChequeEspecial() < menorCredito){
                    contaEncontrada = contaCorrenteDaVez;
                }
            }
        }
    }

    public void exibirContas(){
        for(ContaBancaria contaDaVez : contas){
            System.out.println(contaDaVez);
        }
    }
    public void exibirContasPoupanca(){
        for (ContaBancaria contaDaVez : contas){
            if(contaDaVez instanceof ContaBancaria){
                System.out.println(contaDaVez);
            }
        }
    }
    public void cadastrarConta(ContaBancaria conta){
        contas.add(conta);
    }
}
