public class FilaObj<T> {
    private T[] fila;
    private int tamanho;
    private int inicio;
    private int fim;

    public FilaObj(int capacidade) {
        fila = (T[]) new Object[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == fila.length;
    }

    public void insert(T info) {
        if (!isFull()) {
            fila[fim] = info;
            fim = (fim + 1) % fila.length;
            tamanho++;
        } else {
            System.out.println("Fila cheia");
        }
    }

    public T poll() {
        if (!isEmpty()) {
            T info = fila[inicio];
            inicio = (inicio + 1) % fila.length;
            tamanho--;
            return info;
        }
        return null;
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(fila[(inicio + i) % fila.length]);
            }
        }
    }

    public int size(){
        return tamanho;
    }

}