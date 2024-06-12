public class Main {
    public static void main(String[] args) {
        Banco banco01 = new Banco("SPTech Bank");
        ContaBancaria contaBancaria01 = new ContaBancaria("0001","Victor", 100.00, 0);
        ContaCorrente contaCorrente01 = new ContaCorrente("0001","Kikuti", 250.0, 0, 0.0);
        ContaPoupanca contaPoupanca01 = new ContaPoupanca("0001","Gustavao", 300.0, 0, 0.1);

        banco01.cadastrarConta(contaBancaria01);
        banco01.cadastrarConta(contaCorrente01);
        banco01.cadastrarConta(contaPoupanca01);

        banco01.exibirContas();

        System.out.println("Exibindo somente Conta Poupança");
        banco01.exibirContasPoupanca();
    }
}
