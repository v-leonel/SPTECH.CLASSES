public class ListaEstatica {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tam) {
        this.vetor = new int[tam];
        this.nroElem = 0;
    }

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia");
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
    public int removePeloIndice(int tipo){
        if (tipo == 1){
            int aux = vetor[0];
            for (int i = 0; i < nroElem - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            nroElem--;
            return aux;
        } else if (tipo == 2){
            int aux = vetor[nroElem - 1];
            nroElem--;
            return aux;
        } else {
            return -1;
        }
    }
    public int removeElemento(boolean tipo){
        if (tipo){
            int aux = vetor[0];
            for (int i = 0; i < nroElem - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            nroElem--;
            return aux;
        } else {
            int aux = vetor[nroElem - 1];
            nroElem--;
            return aux;
        }
    }
}
