package school.sptech.lista01;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer filhosDe0A3 = 0;
        Integer filhosDe4A16 = 0;
        Integer filhosDe17A18 = 0;

        System.out.println("Informe número de filhos entre 0 e 4 anos");
        filhosDe0A3 = scan.nextInt();

        System.out.println("Informe número de filhos entre 4 e 16 anos");
        filhosDe4A16 = scan.nextInt();

        System.out.println("Informe número de filhos entre 17 e 18 anos");
        filhosDe17A18 = scan.nextInt();

        Double valorBolsaDe0A3 = 25.12 * filhosDe0A3;
        Double valorBolsaDe4A16 = 15.88 * filhosDe4A16;
        Double valorBolsaDe17A18 = 12.44 * filhosDe17A18;

        Integer totalFilhos = filhosDe0A3 + filhosDe4A16 + filhosDe17A18;
        Double totalBolsa = valorBolsaDe0A3 + valorBolsaDe4A16 + valorBolsaDe17A18;

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$" + totalBolsa + " de bolsa.");



    }
}
