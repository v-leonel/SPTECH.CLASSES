public class ListaObj<T> {
    private T[] lista;
    private int tamanho;

    // Construtor para inicializar a lista
    public ListaObj(int capacidade) {
        lista = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    // Método para adicionar um elemento
    public void adiciona(T elemento) {
        if (tamanho < lista.length) {
            lista[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Lista está cheia!");
        }
    }

    // Método para obter o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }

    // Método para obter um elemento pelo índice
    public T getElemento(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return lista[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
    }

    // Método para exibir todos os elementos
    public void exibe() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(lista[i]);
        }
    }
}
