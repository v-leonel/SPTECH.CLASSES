import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Insira o número na lista " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nExibição dos numeros na ordem inserida:");
        for (int i = 0; i < 7; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n\nExibição dos números na ordem inversa:");
        for (int i = 6; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}