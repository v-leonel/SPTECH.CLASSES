package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(ehPalindromo(vetor));

        converterParaBinario(25);
        System.out.println("\n");

        PilhaObj<String> pilha = new PilhaObj<>(new String[10], 0);
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        System.out.println("Pilha:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
        inverterFrase();
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para verificar se é palíndromo:");
        String frase = scanner.nextLine();
        System.out.println(ehPalindromo(frase));
    }

    public static boolean ehPalindromo(int[] vetor) {
        Pilha pilha = new Pilha(vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            pilha.push(vetor[i]);
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != pilha.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void converterParaBinario(int numero){
        Pilha pilha = new Pilha(10);
        while(numero > 0){
            pilha.push(numero % 2);
            numero = numero / 2;
        }
        while(!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }
    }
    public static String inverterFrase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para inverter:");
        String frase = scanner.nextLine();
        PilhaObj<Character> pilha = new PilhaObj<>(new Character[frase.length()], 0);
        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }
        System.out.println("Frase invertida:");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        return frase;
    }

    public static boolean ehPalindromo(String frase) {
        PilhaObj<Character> pilha = new PilhaObj<>(new Character[frase.length()], 0);
        String fraseFiltrada = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i < fraseFiltrada.length(); i++) {
            pilha.push(fraseFiltrada.charAt(i));
        }
        for (int i = 0; i < fraseFiltrada.length(); i++) {
            if (fraseFiltrada.charAt(i) != (char) pilha.pop()) {
                return false;
            }
        }
        return true;
    }
}