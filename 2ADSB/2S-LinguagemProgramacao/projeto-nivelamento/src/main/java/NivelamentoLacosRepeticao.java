import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoLacosRepeticao {
    public static void main(String[] args) {
//        for (Integer i = 1; i <= 10; i++){
//            System.out.println("Valor de i: " + i.doubleValue());
//        }
//
//        for (Double i = 0.0; i <= 20; i++){
//            System.out.println("Valor de i: " + i);
//        }
//
//        Integer contador = 1;
//
//        while(contador <= 10){
//            System.out.println(contador);
//            contador++;
//        }

//        Integer numeroSorteado = 1;
//        while(numeroSorteado != 0)

        Integer numeroSorteado2;
        do{
            numeroSorteado2 = ThreadLocalRandom.current().nextInt(0,10);
            System.out.println(numeroSorteado2);
        }while (numeroSorteado2 != 0);

    }
}
