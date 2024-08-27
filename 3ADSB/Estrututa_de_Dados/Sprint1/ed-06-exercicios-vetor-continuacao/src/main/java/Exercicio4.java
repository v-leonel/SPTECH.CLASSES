import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        System.out.print("\nInsira um número para encontrar quantas vezes ele ocorre no vetor: ");
        int numeroPesquisa = scanner.nextInt();

        int contagem = 0;
        for (int i = 0; i < 10; i++) {
            if (valores[i] == numeroPesquisa) {
                contagem++;
            }
        }

        if (contagem > 0) {
            System.out.println("O número " + numeroPesquisa + " ocorre " + contagem + " vezes no vetor.");
        } else {
            System.out.println("O número " + numeroPesquisa + " não ocorre nenhuma vez.");
        }
    }
}
