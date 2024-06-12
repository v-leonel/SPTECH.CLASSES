import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {


    Double meta;
    Double saldo;
    Boolean quebrado;

    void depositar(Double quantia){
        if(quebrado){
            System.out.println("O cofrinho está quebrado.");
        }
        else {
            saldo += quantia;
            System.out.println("Deposito de R$%.2f feito.".formatted(quantia));
        }
    }

    void agitar(){
        if(quebrado){
            System.out.println("Não é possível agitar, o cofrinho está quebrado.");
        }
        else {
            Integer numeroRandomico = ThreadLocalRandom.current().nextInt(0, saldo);
            System.out.println("Você sacou R$%d do cofrinho".formatted(numeroRandomico));
        }
    }

    void quebrar(){}

}


