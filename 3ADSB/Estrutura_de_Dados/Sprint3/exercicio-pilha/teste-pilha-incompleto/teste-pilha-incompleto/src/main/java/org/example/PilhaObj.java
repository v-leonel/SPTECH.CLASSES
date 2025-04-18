package org.example;

public class PilhaObj<T> {
    private T[] pilha;
    private int topo;

    public PilhaObj(T[] pilha, int topo) {
        this.pilha = pilha;
        this.topo = topo;
    }

    public void push(T i) {
        pilha[topo] = i;
        topo++;
    }

    public Object pop() {
        topo--;
        return pilha[topo];
    }

    public boolean isEmpty() {
        return topo == 0;
    }
}
