import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoCondicionais {
    public static void main(String[] args) {
        Integer numero01 = 5;
        Integer numero02 = 10;
        String numero03 = "5";

        if (numero01 > numero02){
            System.out.println("Varíavel numero01 é maior que o numero02");
        }
        else if (numero01.equals(numero03)){
            System.out.println("As varíaveis possuem valores iguais");
        }
        else {
            System.out.println("Varíavel numero2 maior que numero01");
        }

        Boolean booleano = numero01 < numero02;
        if(booleano){
            System.out.println("É verdade");
        }
        else {
            System.out.println("É false");
        }

        Integer numeroRandomico = ThreadLocalRandom.current().nextInt(0, 99);
        System.out.println(numeroRandomico++);
    }
}
