import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] t1 = new String[5];
        String[] t2 = new String[5];
        int contadorTurma1 = 0;
        int contadorTurma2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a turma do aluno (T1 ou T2): ");
            String turma = scanner.nextLine();

            if (turma.equals("T1")) {
               t1[contadorTurma1++] = nome;
            } else if (turma.equals("T2")) {
                t2[contadorTurma2++] = nome;
            } else {
                System.out.println("Turma inválida! Tente novamente.");
                i--;
            }
        }
        System.out.println("Quantidade de alunos na turma T1: " + contadorTurma1);
        System.out.println("Alunos da turma T1:");
        for (int i = 0; i < contadorTurma1; i++) {
            System.out.println(t1[i]);
        }

        System.out.println("Quantidade de alunos na turma T2: " + contadorTurma2);
        System.out.println("Alunos da turma T2:");
        for (int i = 0; i < contadorTurma2; i++) {
            System.out.println(t2[i]);
        }

        scanner.close();
    }
}
