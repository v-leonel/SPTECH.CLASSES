import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nInsira um nome que deseja pesquisar: ");
        String nomePesquisa = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Nome encontrado no índice " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado.");
        }
    }
}
