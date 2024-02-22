package school.sptech.lista01;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer tempoAquecimento = 0;
        Integer tempoAerobicos = 0;
        Integer tempoMusculacao = 0;

        System.out.println("Insira em minutos o tempo de aquecimento.");
        tempoAquecimento = scan.nextInt();

        System.out.println("Insira em minutos o tempo de exercícios aeróbicos.");
        tempoAerobicos = scan.nextInt();

        System.out.println("Insira em minutos o tempo de exercícios de musculação");
        tempoMusculacao = scan.nextInt();

        Integer gastoCalAquecimento = tempoAquecimento * 12;
        Integer gastoCalAerobico = tempoAerobicos * 20;
        Integer gastoCalMusculacao = tempoMusculacao * 25;

        Integer tempoTotal =  tempoAerobicos + tempoAquecimento + tempoMusculacao;
        Integer gastoTotal = gastoCalAerobico + gastoCalAquecimento + gastoCalMusculacao;

        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", tempoTotal, gastoTotal);
    }
}




