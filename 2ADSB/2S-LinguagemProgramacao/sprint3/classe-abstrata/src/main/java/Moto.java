public class Moto extends Veiculo{
    private Boolean possuiCapacete;

    public Moto(String nomeCliente, String marca, Double valor, Boolean possuiCapacete) {
        super(nomeCliente, marca, valor);
        this.possuiCapacete = possuiCapacete;
    }

    @Override
    public void exibirRelatorioRevisao() {
        System.out.println("Relatório da moto de : " + nomeCliente);
        if(possuiCapacete){
            System.out.println("Tudo ok");
        } else {
            System.out.println("Compre um capacete aqui:");
        }
    }
}
