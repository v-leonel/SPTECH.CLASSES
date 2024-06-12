public class ContaCorrente extends ContaBancaria{
    private Double limiteChequeEspecial;

    public ContaCorrente(String codigoConta, String nomeTitular, Double saldo, Integer qtdOperacaoRealizadas, Double limiteChequeEspecial) {
        super(codigoConta, nomeTitular, saldo, qtdOperacaoRealizadas);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(Double valorSaque) {
        Double valorSaquePermitido = saldo + limiteChequeEspecial;

        if(valorSaque <= valorSaquePermitido){
            saldo -= valorSaque;
            qtdOperacaoRealizadas ++;
            System.out.println("Saque efetuado");
        } else {
            System.out.println("Valor indefenido");
        }
    }

    @Override
    public String toString(){
        return """
                """.formatted(super.toString());
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
