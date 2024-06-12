public class Pet {
    private String nome;
    private Integer qtdIdasAoPetShop;
    private Double totalGasto;

    public Pet(String nome, Integer qtdIdasAoPetShop, Double totalGasto) {
        this.nome = nome;
        this.qtdIdasAoPetShop = qtdIdasAoPetShop;
        this.totalGasto = totalGasto;
    }

    public Pet(){}

    public void tomarBanho(Double valorBanho){
        qtdIdasAoPetShop++;
        totalGasto += valorBanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdIdasAoPetShop() {
        return qtdIdasAoPetShop;
    }

    public void setQtdIdasAoPetShop(Integer qtdIdasAoPetShop) {
        this.qtdIdasAoPetShop = qtdIdasAoPetShop;
    }

    public Double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(Double totalGasto) {
        this.totalGasto = totalGasto;
    }
}
