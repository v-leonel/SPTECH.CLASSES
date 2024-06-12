public class ContaBancaria {
    public double setSaldo;
    private String nomeTitular;
    private Double saldo;
    private String numeroConta;
    private Integer numeroAgencia;

    //Construtor:
    //Sempre publico
    //Tem o mesmo nome da classe

    //Padrão GET e SET
    // GET = Buscar
    // SET = Alterar

    public ContaBancaria(String nomeTitular,String numeroConta, Integer numeroAgencia) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }
    public ContaBancaria(){}

    void sacar(Double valorSaque){
        if(valorSaque <= 0 || valorSaque > saldo) {
            System.out.println("Valor de saque inválido");
        } else {
          saldo -= valorSaque;
          System.out.println(nomeTitular + "Saque realizado.");
        }
    }

    void depositar(Double valorDeposito){
        if (valorDeposito <= 0){
            System.out.println("Valor inválido");
        } else {
            saldo += valorDeposito;
            System.out.println("Deposito Realizado!");
        }
    }

    void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    String getNomeTitular(){
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
}
