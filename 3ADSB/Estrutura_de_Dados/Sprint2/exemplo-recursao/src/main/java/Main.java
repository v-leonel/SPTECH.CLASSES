public class Main {

    // Método não recursivo - iterativo
    public static void contagemRegressiva(int n){
        for (int i=n;i>=0;i--){
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva(int n){
        if(n == 0){
            System.out.println(n);
        }
        else {
            System.out.println(n);
            contagemRegressivaRecursiva(n-1);
        }
    }

    // Fatorial
    // n! = 1, se n = 0
    // n! = n * (n-1), se n > 0
    // 2! = 2 * 1! = 2 * 1 * 0! = 2 * 1 = 2

    public static int fatorial(int n){
        if (n == 0){
            return 1;
        }
        else {
            return n * fatorial(n -1);
        }
    }

    public static void exibeVetor(int[]  v, int i ){
        if (i < v.length){
            System.out.println(v[i]);
            exibeVetor(v, i + 1);
        }
    }    public static void exibeVetorInvertido(int[]  v, int i ){
        if (i >= 0){
            System.out.println(v[i]);
            exibeVetorInvertido(v, i - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Contagem regressiva: ");
        contagemRegressiva(5);
        System.out.println("\nContagem regressiva recursiva: ");
        contagemRegressivaRecursiva(4);
        System.out.println("\nFatorial: ");
        fatorial(4);

        System.out.println("\nExibicao do vetor: ");
        int[] vetor = {10,20,30,40,50};
        exibeVetor(vetor, v + 1);

        System.out.println("\nExibicao do vetor invertido: ");
        exibeVetor(vetor, vetor.lenght -1);
    }
}
