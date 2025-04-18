public class ListaEstaticaOrdenada {
    private int[] vetor;
    private int nroElem;

    public ListaEstaticaOrdenada(int tam) {
        this.vetor = new int[tam];
        this.nroElem = 0;
    }
    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            throw new IllegalStateException("Lista cheia");
        } else {
            int i;
            for (i = nroElem - 1; (i >= 0 && vetor[i] > elemento); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = elemento;
            nroElem++;
        }
    }
}
