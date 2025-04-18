package org.example;

public class PilhaObj<T> {

    // Atributos
    private T[] pilha;
    private int topo;

    // Construtor
    public PilhaObj(int capacidade) {
        pilha = (T[]) new Object[capacidade];
        topo = -1;
    }

    // Métodos

    // Retorna true se a pilha estiver vazia e false caso contrário
    public Boolean isEmpty() {
        if(topo == -1){
            return true;
        }
        return false;
    }

    // Retorna true se a pilha estiver cheia e false caso contrário
    public Boolean isFull() {
        if (topo == pilha.length - 1) {
            return true;
        }
        return false;
    }

    // Se a pilha estiver cheia, deve lançar IllegalStateException
    // Se a pilha não estiver cheia, empilha info
    public void push(T info) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia");
        } else {
            topo++;
            pilha[topo] = info;
        }
    }

    // Desempilha e retorna o elemento do topo da pilha
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T temp = pilha[topo];
        pilha[topo] = null;
        topo--;
        return temp;
    }

    // Retorna o elemento do topo da pilha, sem desempilhar
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo];
    }

    // Exibe o conteúdo da pilha
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println(pilha[i]);
            }
        }
    }

}