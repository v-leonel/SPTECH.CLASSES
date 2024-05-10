public class Carro extends Veiculo {
    private Double nivelDeOleo;
    private Boolean possuiEstepe;

    public Carro(String nomeCliente, String marca, Double valor, Double nivelDeOleo, Boolean possuiEstepe) {
        super(nomeCliente, marca, valor);
        this.nivelDeOleo = nivelDeOleo;
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public void exibirRelatorioRevisao() {
        System.out.println("Relatório do carro de: " + nomeCliente);
        if(nivelDeOleo < 1.5){
            System.out.println("Nivel de óleo baixo, troque aqui");
        } else {
            System.out.println("Nivel de óleo ok");
        }

        if(possuiEstepe){
            System.out.println("Estepe ok!");
        } else {
            System.out.println("Compre o estepe aqui :)");
        }
    }

    public Double getNivelDeOleo() {
        return nivelDeOleo;
    }

    public void setNivelDeOleo(Double nivelDeOleo) {
        this.nivelDeOleo = nivelDeOleo;
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nivelDeOleo=" + nivelDeOleo +
                ", possuiEstepe=" + possuiEstepe +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                '}';
    }
}

