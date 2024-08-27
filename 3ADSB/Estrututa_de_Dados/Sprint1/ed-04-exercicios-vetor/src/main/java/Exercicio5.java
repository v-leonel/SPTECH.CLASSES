import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] modelos = new String[5];
        double[] rendimentos = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do modelo do carro " + (i + 1) + ": ");
            modelos[i] = scanner.nextLine();
            System.out.print("Digite o rendimento (km/l) do " + modelos[i] + ": ");
            rendimentos[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        int indiceMaisEconomico = 0;
        double melhorRendimento = rendimentos[0];

        for (int i = 1; i < 5; i++) {
            if (rendimentos[i] > melhorRendimento) {
                melhorRendimento = rendimentos[i];
                indiceMaisEconomico = i;
            }
        }

        System.out.println("O modelo de carro mais econômico é o " + modelos[indiceMaisEconomico] +
                " com um rendimento de " + melhorRendimento + " km/l.");

        scanner.close();
    }
}
