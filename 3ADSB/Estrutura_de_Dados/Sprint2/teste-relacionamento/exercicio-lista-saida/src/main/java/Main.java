import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaObj<Animal> lista = new ListaObj<>(5);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nCadastro de animais");
            System.out.println("1 - Adicionar um animal na lista (cadastro)");
            System.out.println("2 - Exibir os animais cadastrados (relatório)");
            System.out.println("3 - Fim do programa (encerrar)");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    if (lista.getTamanho() < 5) {
                        System.out.print("Identificador do animal: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nome do animal: ");
                        String nome = scanner.nextLine();
                        System.out.print("Idade do animal: ");
                        int idade = scanner.nextInt();
                        System.out.print("Animal é doméstico (true/false): ");
                        boolean domestico = scanner.nextBoolean();
                        System.out.print("Sexo do animal (M/F): ");
                        char sexo = scanner.next().charAt(0);
                        scanner.nextLine();

                        Animal animal = new Animal(id, nome, idade, domestico, sexo);
                        lista.adiciona(animal);
                        System.out.println("Animal adicionado com sucesso!");
                    } else {
                        System.out.println("Lista cheia!");
                    }
                }
                case 2 -> {
                    System.out.printf("%-10s %-20s %10s %10s %10s\n", "ID", "Nome", "Idade", "Doméstico", "Sexo");

                    for (int i = 0; i < lista.getTamanho(); i++) {
                        Animal a = lista.getElemento(i);
                        System.out.println(a);
                    }
                }
                case 3 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
