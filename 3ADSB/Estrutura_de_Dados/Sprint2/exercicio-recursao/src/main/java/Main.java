public class Main {

    public static int somaNumerosIterativo(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static int somaNumerosRecursivo(int n ){
        if (n == 0) {
            return 0;
        }
        return n + somaNumerosRecursivo(n - 1);
    }

    public static int somaVetorIterativo(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static int somaVetorRecursivo(int[] vetor, int n) {
        if (n == 0) {
            return vetor[0];
        }
        return vetor[n] + somaVetorRecursivo(vetor, n - 1);
    }

    public static int somaVetorParIterativo(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
            }
        }
        return soma;
    }
    
    public static int somaVetorParRecursivo(int[] vetor, int n) {
        if (n == 0) {
            if (vetor[0] % 2 == 0) {
                return vetor[0];
            }
            return 0;
        }
        if (vetor[n] % 2 == 0) {
            return vetor[n] + somaVetorParRecursivo(vetor, n - 1);
        }
        return somaVetorParRecursivo(vetor, n - 1);
    }

    public static int somaVetorImparIterativo(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                soma += vetor[i];
            }
        }
        return soma;
    }
    
    public static int somaVetorImparRecursivo(int[] vetor, int n) {
        if (n == 0) {
            if (vetor[0] % 2 != 0) {
                return vetor[0];
            }
            return 0;
        }
        if (vetor[n] % 2 != 0) {
            return vetor[n] + somaVetorImparRecursivo(vetor, n - 1);
        }
        return somaVetorImparRecursivo(vetor, n - 1);
    }

    public static int contaOcorrenciasIterativo(int[] vetor, int x) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static int contaOcorrenciasRecursivo(int[] vetor, int n, int x) {
        if (n < 0) {
            return 0;
        }
        if (vetor[n] == x) {
            return 1 + contaOcorrenciasRecursivo(vetor, n - 1, x);
        }
        return contaOcorrenciasRecursivo(vetor, n - 1, x);
    }

    public static int euclidesIterativo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int euclidesRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidesRecursivo(b, a % b);
    }

    public static String decimalParaBinarioRecursivoHelper(int numero) {
        if (numero == 0) {
            return "";
        }
        return decimalParaBinarioRecursivoHelper(numero / 2) + numero % 2;
    }

    public static int maiorElementoIterativo(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int maiorElementoRecursivo(int[] vetor, int n) {
        if (n == 0) {
            return vetor[0];
        }
        int maior = maiorElementoRecursivo(vetor, n - 1);
        if (vetor[n] > maior) {
            return vetor[n];
        }
        return maior;
    }

    public static int somaDigitosIterativo(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static int somaDigitosRecursivo(int numero) {
        if (numero == 0) {
            return 0;
        }
        return (numero % 10) + somaDigitosRecursivo(numero / 10);
    }

    public static String decimalParaBinarioIterativo(int numero) {
        if (numero == 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            binario.insert(0, numero % 2);
            numero /= 2;
        }
        return binario.toString();
    }

    public static String decimalParaBinarioRecursivo(int numero) {
        if (numero == 0) {
            return "0";
        }
        return decimalParaBinarioRecursivoHelper(numero);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numero = 12345;
        int a = 56, b = 98;

        System.out.println("\nSoma dos números de 0 a 10 (iterativo): " + somaNumerosIterativo(10));
        System.out.println("\nSoma dos números de 0 a 10 (recursivo): " + somaNumerosRecursivo(10));
        
        System.out.println("\nSoma dos elementos do vetor (iterativo): " + somaVetorIterativo(vetor));        
        System.out.println("\nSoma dos elementos do vetor (recursivo): " + somaVetorRecursivo(vetor, vetor.length - 1));
        
        System.out.println("\nSoma dos elementos pares do vetor (iterativo): " + somaVetorParIterativo(vetor));       
        System.out.println("\nSoma dos elementos pares do vetor (recursivo): " + somaVetorParRecursivo(vetor, vetor.length - 1));
        
        System.out.println("\nSoma dos elementos ímpares do vetor (iterativo): " + somaVetorImparIterativo(vetor));       
        System.out.println("\nSoma dos elementos ímpares do vetor (recursivo): " + somaVetorImparRecursivo(vetor, vetor.length - 1));
        
        System.out.println("\nContagem de ocorrências do número 5 no vetor (iterativo): " + contaOcorrenciasIterativo(vetor, 5));         
        System.out.println("\nContagem de ocorrências do número 5 no vetor (recursivo): " + contaOcorrenciasRecursivo(vetor, vetor.length - 1, 5));
        
        System.out.println("\nEuclides de 56 e 98 (iterativo): " + euclidesIterativo(a, b));          
        System.out.println("\nEuclides de 56 e 98 (recursivo): " + euclidesRecursivo(a, b));
        
        System.out.println("\nMaior elemento do vetor (iterativo): " + maiorElementoIterativo(vetor));        
        System.out.println("\nMaior elemento do vetor (recursivo): " + maiorElementoRecursivo(vetor, vetor.length - 1));
        
        System.out.println("\nSoma dos dígitos do número 12345 (iterativo): " + somaDigitosIterativo(numero));        
        System.out.println("\nSoma dos dígitos do número 12345 (recursivo): " + somaDigitosRecursivo(numero));
        
        System.out.println("\nNúmero 12345 em binário (iterativo): " + decimalParaBinarioIterativo(numero));
        System.out.println("\nNúmero 12345 em binário (recursivo): " + decimalParaBinarioRecursivo(numero));
    }
}
