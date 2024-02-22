package school.sptech.lista02;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer numeroEscolhido = 0;
        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        Boolean encontrar = false;


        System.out.println("Escolha um numero de 1 a 100.");
        numeroEscolhido = scan.nextInt();

        Integer numeroSorteado;

        for(Integer i = 1; i <= 200; i++){
            numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
            if (numeroEscolhido.equals(numeroSorteado) && !encontrar){
                System.out.printf("A posição do numero sorteado foi: %d\n", i);
                encontrar = true;
            }
            if(numeroSorteado % 2 == 0){
                numerosPares++;
            }
            else{
                numerosImpares++;
            }
        }
        System.out.printf("Quantidade de números pares encontrados %d\n", numerosPares);
        System.out.printf("Quantidade de números impares encontrados %d", numerosImpares);
    }

}
