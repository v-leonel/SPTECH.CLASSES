package school.sptech.lista02;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {

        Integer numeroAleatorio;
        Integer somaNumerosAleatorios = 0;

        do {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            somaNumerosAleatorios += numeroAleatorio;
            System.out.println(numeroAleatorio);  
        }while (numeroAleatorio != 0);

        System.out.printf("A soma dos números é %d", somaNumerosAleatorios);
    }
}
