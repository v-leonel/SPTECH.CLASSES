public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Manoel", 7.0, 8.0);

        System.out.println("Exibindo aluno");
        System.out.println(aluno);

        System.out.println("Exibindo nota final");
        System.out.println(aluno.calcularNotaFinal());

        AlunoPos alunoPos = (AlunoPos) new Aluno("Victor", 10.0, 8.0);
    }
}
