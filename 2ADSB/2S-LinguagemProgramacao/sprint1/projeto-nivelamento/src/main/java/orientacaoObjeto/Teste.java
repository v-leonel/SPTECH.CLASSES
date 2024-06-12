package orientacaoObjeto;

public class Teste {
    public static void main(String[] args) {
        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Giuliana";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "0001";

        BilheteUnico bilhete02 = new BilheteUnico();

        bilhete02.nomeTitular = "Giuliana";
        bilhete02.saldo = 0.0;
        bilhete02.codigo = "0001";

        BilheteUnico bilhete03 = new BilheteUnico();

        bilhete03.nomeTitular = "Giuliana";
        bilhete03.saldo = 0.0;
        bilhete03.codigo = "0001";

        bilhete01.carregar(50.0);
        System.out.println("Saldo bilhete 01: " + bilhete01.saldo);

        bilhete02.carregar(144.50);
        System.out.println("Saldo bilhete 02: " + bilhete02.saldo);
    }
}
