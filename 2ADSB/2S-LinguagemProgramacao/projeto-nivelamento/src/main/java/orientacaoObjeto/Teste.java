package orientacaoObjeto;

public class Teste {
    public static void main(String[] args) {
        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Giuliana";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "0001";

        bilhete01.carregar(50.0);
        System.out.println("Saldo bilhete 01:" + bilhete01.saldo);
    }
}
