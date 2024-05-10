public class Main {
    public static void main(String[] args) {
        Carro carro01 = new Carro("leonel", "fiat", 13.000,  4.5, false );
        Bicicleta bike01 = new Bicicleta("Ian", "caloi", 3.000, 0.5);

        System.out.println(" ");
        System.out.println("Exibindo relatório de revisão dos veiculos:");
        carro01.exibirRelatorioRevisao();
        System.out.println(" ");
        bike01.exibirRelatorioRevisao();
        System.out.println(" ");
    }
}
