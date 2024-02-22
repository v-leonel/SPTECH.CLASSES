package school.sptech.lista01;
import java.util.Scanner;

//Seja executável
  //      Crie uma variável que armazene o nome e duas notas ao usuário.
   //   As notas são números reais.
    // Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
     //Exiba uma frase como esta: Olá, NOME. Sua média foi de MEDIA
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        Double nota1 = 0.0;
        Double nota2 = 0.0;

        System.out.println("Insira o nome do usuário");
        nome = scan.next();

        System.out.println("Insira a primeira nota do usuário");
        nota1 = scan.nextDouble();

        System.out.println("Insira a primeira nota do usuário");
        nota2 = scan.nextDouble();

        Double media = (nota1 + nota2) / 2;

        System.out.printf("Olá, %s. Sua média foi de %f", nome, media);
    }
}
