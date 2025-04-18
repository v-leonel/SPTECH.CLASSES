public class ListaObj <T>{
    private T[] vetor;
    private int nroElem;

    public ListaObj(int tam) {
        this.vetor = (T[]) new Object[tam];
        this.nroElem = 0;
    }

    public void adiciona(T elemento) {
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

    public int busca(T elemento) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(elemento)) {
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

    public boolean removeElemento(T elemento){
        return removePeloIndice(busca(elemento));
    }
    public int getTamanho(){
        return nroElem;
    }

    public T getElemento(int indice){
        if(indice < 0 || indice >= nroElem){
            return null;
        }
        return vetor[indice];
    }
    public void limpa(){
        nroElem = 0;
    }

    /*
        public void substitui(int valorAntigo, int valorNovo) {
        int indice = busca(valorAntigo);
        if (indice != -1) {
            vetor[indice] = valorNovo;
        }
        if (valorAntigo == -1) {
            {
                throw new IllegalArgumentException("Elemento não encontrado");
            }
        }
    }
     */
    public int contaOcorrencias(T ocorrencia){
        int contador = 0;
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == ocorrencia) {
                contador++;
            }
        }
        return contador;
    }

    public void adicionaNoInicio(T elemento){
        if (nroElem >= vetor.length) {
            throw new IllegalStateException("Lista cheia");
        } else {
            for (int i = nroElem; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[0] = elemento;
            nroElem++;
        }
    }
}
