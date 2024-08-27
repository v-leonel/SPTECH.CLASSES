import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o número na lista " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = soma / 10.0;

        System.out.println("\nA média dos números: " + media);

        System.out.println("Números acima da média:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }
}
