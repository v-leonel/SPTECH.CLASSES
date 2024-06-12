package ex03;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.cargo = "Analista";
        empregado01.salario = 5400.00;

        System.out.println("Salário antes do reajuste: R$ " + empregado01.salario);

        Empregado empregado02 = new Empregado();
        empregado02.nome = "Maria";
        empregado02.cargo = "Gerente";
        empregado02.salario = 12000.00;

        System.out.println("Salário antes do reajuste: R$ " + empregado02.salario);
    }
}