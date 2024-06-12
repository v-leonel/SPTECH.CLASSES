package ex01;

public class App {
    public static void main(String[] args) {
        Bolo boloMorango = new Bolo();
        boloMorango.sabor = "Morango";
        boloMorango.valor = 40.00;

        Bolo boloChocolate = new Bolo();
        boloChocolate.sabor = "Chocolate";
        boloChocolate.valor = 35.00;

        Bolo boloNinho = new Bolo();
        boloNinho.sabor = "Leite Ninho";
        boloNinho.valor = 45.00;

        boloMorango.comprarBolo(2);
        boloChocolate.comprarBolo(3);
        boloChocolate.comprarBolo(10);
        boloChocolate.comprarBolo(30);
        boloChocolate.comprarBolo(2);
        boloChocolate.comprarBolo(23);
        boloNinho.comprarBolo(4);
        boloNinho.comprarBolo(40);
        boloNinho.comprarBolo(1);

        boloMorango.exibirRelatorio();
        boloChocolate.exibirRelatorio();
        boloNinho.exibirRelatorio();

    }
}