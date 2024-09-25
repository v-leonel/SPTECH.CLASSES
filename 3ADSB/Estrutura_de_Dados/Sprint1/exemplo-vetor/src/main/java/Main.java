import java.util.Scanner;

public class Main {

    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println("vetor[" + i +"]=" + v [i]);
        }
    }

    public static void leVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o valor de vetor [" +i+"]");
            vetor[i] = leitor.nextInt();
        }
    }
    public static void main(String[] args) {
        // Criação de um vetor de 5 inteiros
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        // Criação de um vetor ja inicializado
        int[] vetor2 = {100,200,300,400,500,600,700};

        String[] vetor3 = new String[4];

        //Criação de uma variavel tamanho
        int tamanho;

        //Declaração de um vetor que sera criado com o tamanho definido pelo usuário
       //int

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * 10;
        }

        //Preenchendo o vetor com valores digitados pelo usuario
        leVetor(vetor);

        //Preenchendo o vetor3 com valores digitados pelo usuario
        for(int i = 0; i < vetor3.length; i++){
            System.out.println("Digite o valor de vetor 3[" +i+"]");
            vetor3[i] = leitor.next();
        }

        //Exibe o vetor
        System.out.println("\nVetor1:");
        exibeVetor(vetor);

        //Exibe o vetor2
        System.out.println("\nVetor2:");
        exibeVetor(vetor2);

        System.out.println("\nVetor3");
        for(String s : vetor3){
            System.out.println(s);
        }
        do {
            System.out.println("Digite o  valor do tamanho");
            System.out.println("Esse valor deve ser maior ou igual a 3");
            tamanho = leitor.nextInt();
        }while (tamanho <= 3);

        //Criação do vetor4 com o tamanho digitado pelo usuário

        int[] vetor4 = new int[tamanho];
    }
}
