package org.example;

public class FilaObj<T> {

    // Atributos
    private int tamanho;
    private T[] fila;

    // Construtor
    public FilaObj(int capacidade) {
        fila = (T[]) new Object[capacidade];
        tamanho = getTamanho();
    }
    // Métodos
    // Retorna true se a fila está vazia e false coso contrário
    public boolean isEmpty() {
        if(tamanho == 0){
            return true;
        }
        return false;
    }

    // Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        if (tamanho == fila.length) {
            return true;
        }
        return false;
    }

    // Se a fila não estiver cheia, insere info na fila
    // Se a fila estiver cheia, deve lançar IllegalStateException
    public void insert(T info) {
        if (isFull()) {
            throw new IllegalStateException("Fila cheia");
        } else {
            fila[tamanho] = info;
            tamanho++;
        }
    }

    // Retorna o primeiro da fila
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return fila[0];
    }

    // Remove e retorna o primerio elemento da fila
    // Antes de retorna, se a fila não estiver vazia, deve fazer a fila "andar"
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T temp = fila[0];
        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[tamanho - 1] = null;
        tamanho--;
        return temp;
    }

    // Exibe os elementos da fila
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(fila[i]);
            }
        }
    }

    // Retorna o vetor fila
    public T[] getFila() {
        return fila;
    }

    public int getTamanho() {
        return tamanho;
    }
}