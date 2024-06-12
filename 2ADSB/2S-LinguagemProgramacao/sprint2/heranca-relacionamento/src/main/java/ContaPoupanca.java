public class ContaPoupanca extends ContaBancaria{
    private Double taxaRendimento;

    public ContaPoupanca(String codigoConta, String nomeTitular, Double saldo, Integer qtdOperacaoRealizadas, Double taxaRendimento) {
        super(codigoConta, nomeTitular, saldo, qtdOperacaoRealizadas);
        this.taxaRendimento = 0.1;
    }

    public void depositarRendimento(){
        Double valorRendimento = saldo * taxaRendimento;
        saldo += valorRendimento;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString(){
        return """
                %s
                Taxa de rendimento: %.2f
                """.formatted(super.toString(), taxaRendimento);
    }
}
