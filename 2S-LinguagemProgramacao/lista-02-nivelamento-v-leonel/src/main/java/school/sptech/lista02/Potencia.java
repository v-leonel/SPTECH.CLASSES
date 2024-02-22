package school.sptech.lista02;
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer base = 0;
        Integer expoente = 0;

        System.out.println("Insira o valor base");
        base = scan.nextInt();

        System.out.println("Insira o valor do expoente");
        expoente = scan.nextInt();

        Integer resultado = 1;

        for(Integer i = 0; i < expoente; i++){
            resultado *= base;
        }

        System.out.printf("O resultado de %d elevado a %d é :%d",base, expoente, resultado);

    }
}
