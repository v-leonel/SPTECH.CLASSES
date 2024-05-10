public abstract class Veiculo {
    protected String nomeCliente;
    protected String marca;
    protected Double valor;

    public Veiculo(String nomeCliente, String marca, Double valor) {
        this.nomeCliente = nomeCliente;
        this.marca = marca;
        this.valor = 0.0;
    }

    public abstract void exibirRelatorioRevisao();


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                '}';
    }
}
