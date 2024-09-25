import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leito = new Scanner(System.in);

        String[] semana = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Quinta", "Sexta", "Sabado"};

        System.out.println("Digite um valor de 1 a 7");

        System.out.println("\nVetor:");
        for (int i = 0; i < semana.length; i++){
            System.out.println("vetor[" + i +"]=" + semana [i]);
        }
    }
}
