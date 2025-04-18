public class Fila {
    // Atributos
    private int tamanho;
    private String[] fila;

    // Construtor
    public Fila(int capacidade) {
        this.tamanho = 0;
        this.fila = new String[capacidade];
    }

    // Métodos

    /* Método isEmpty() - retorna true se a fila está vazia e false caso contrário */

    public boolean isEmpty(){
        return tamanho == 0;
    }

    /* Método isFull() - retorna true se a fila está cheia e false caso contrário */
    public boolean isFull(){
        if (tamanho == fila.length) {
            return true;
        }
        return false;
    }
    /* Método insert - recebe um elemento e insere esse elemento na fila
                       no índice tamanho, e incrementa tamanho
                       Lançar IllegalStateException caso a fila esteja cheia
     */
    public void insert(String info){
        if (isFull()) {
            throw new IllegalStateException("Fila cheia");
        }
        fila[tamanho] = info;
        tamanho++;
    }
}
