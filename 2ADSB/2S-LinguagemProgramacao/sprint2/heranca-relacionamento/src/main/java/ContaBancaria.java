public class ContaBancaria {
    protected String codigoConta;
    protected String nomeTitular;
    protected Double saldo;
    protected Integer qtdOperacaoRealizadas;

    public ContaBancaria(String codigoConta, String nomeTitular, Double saldo, Integer qtdOperacaoRealizadas) {
        this.codigoConta = codigoConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.qtdOperacaoRealizadas = 0;
    }


    public ContaBancaria() {
    }

    public void sacar(Double valorSaque){
        if(valorSaque <= saldo){
            saldo -= valorSaque;
            qtdOperacaoRealizadas++;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void exibeRelatorioOperacoes(){
        System.out.println("""
                O usuário %s realizou %d operações
                """.formatted(nomeTitular, qtdOperacaoRealizadas));
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    @Override
    public String toString(){
        return """
                Código %s
                Nome %s
                Saldo %.2f
                Quantidade de operações %d
                """.formatted(codigoConta,nomeTitular,saldo,qtdOperacaoRealizadas);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getQtdOperacaoRealizadas() {
        return qtdOperacaoRealizadas;
    }

    public void setQtdOperacaoRealizadas(Integer qtdOperacaoRealizadas) {
        this.qtdOperacaoRealizadas = qtdOperacaoRealizadas;
    }
}

