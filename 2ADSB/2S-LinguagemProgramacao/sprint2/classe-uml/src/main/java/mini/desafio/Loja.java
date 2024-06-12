package mini.desafio;

public class Loja {
    private String nomeLoja;
    private Integer qtdVendas;
    private Integer qtdMetaVendas;
    private Double valorTotalVendas;

    public Loja(String nomeLoja, Integer qtdVendas, Integer qtdMetaVendas, Double valorTotalVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = 0;
        this.qtdMetaVendas = 0;
        this.valorTotalVendas = 0.0;
    }

    public void realizarVenda(Double valorVenda){
        this.qtdVendas ++;
        this.valorTotalVendas += valorVenda;
    }

    public void realizarVenda(Double valorVenda, Double Desconto){

    }

    public Boolean verificarVenda(){

    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }
}
