package org.example;

public class ListaEstatica {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tam) {
        this.vetor = new int[tam];
        this.nroElem = 0;
    }

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            throw new IllegalStateException("Lista cheia");
        } else {
            vetor[nroElem++] = elemento;
        }
    }

    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public int busca(int elemento) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
    public boolean removePeloIndice(int indice){
        if (indice < 0 || indice >= nroElem) {
            return false;
        }
        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        nroElem--;
        return true;
    }

    public boolean removeElemento(int elemento){
        return removePeloIndice(busca(elemento));
    }

    public void substitui(int valorAntigo, int valorNovo){
        int indice = busca(valorAntigo);
        if (indice != -1){
            vetor[indice] = valorNovo;
        }
    }

    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
