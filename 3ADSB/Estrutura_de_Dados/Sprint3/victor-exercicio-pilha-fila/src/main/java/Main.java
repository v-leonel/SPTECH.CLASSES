import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1- Salvar objeto");
            System.out.println("2- Deletar objeto");
            System.out.println("3- Exibir");
            System.out.println("4- Desfazer");
            System.out.println("5- Agendar salvar");
            System.out.println("6- Executar agendado");
            System.out.println("7- Fim");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o ID do tema:");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);

        scanner.close();
    }
}