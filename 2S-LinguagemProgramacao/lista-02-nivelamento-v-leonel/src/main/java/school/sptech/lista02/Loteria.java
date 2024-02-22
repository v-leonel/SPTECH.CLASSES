package school.sptech.lista02;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer numeroEscolhido = 0;

        System.out.println("Escolha um número entre 0 e 10");
        numeroEscolhido = scan.nextInt();

        Integer numeroAleatorio;
        Integer tentativas = 0;

        do {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(numeroAleatorio);
            tentativas++;
        } while (numeroAleatorio != numeroEscolhido);
            if(tentativas <= 3){
                System.out.println("Você é MUITO sortudo");
            }
            else if(tentativas <= 10){
                System.out.println("Você é sortudo");
            }
            else {
                System.out.println("É melhor você parar de apostar e ir trabalhar.");
            }
    }
}
