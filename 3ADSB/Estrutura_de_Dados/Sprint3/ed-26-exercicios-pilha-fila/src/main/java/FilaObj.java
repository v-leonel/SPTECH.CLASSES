public class FilaObj<T> {
    private int tamanho;
    private T[] fila;
    private int inicio;
    private int fim;

    public FilaObj(int capacidade) {
        this.tamanho = 0;
        this.fila = (T[]) new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == fila.length;
    }

    public void insert(T info) {
        if (isFull()) {
            throw new IllegalStateException("Fila cheia");
        }
        fila[fim] = info;
        fim = (fim + 1) % fila.length;
        tamanho++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        T elemento = fila[inicio];
        inicio = (inicio + 1) % fila.length;
        tamanho--;
        return elemento;
    }
}