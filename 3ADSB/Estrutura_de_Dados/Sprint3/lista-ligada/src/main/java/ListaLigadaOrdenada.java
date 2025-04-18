public class ListaLigadaOrdenada extends ListaLigada {
    private Node atual;
    private Node head;

    public ListaLigadaOrdenada(Node atual, Node head) {
        this.atual = head.getNext();
        this.head = head;
    }
    public ListaLigadaOrdenada() {
        super();
    }
    public void insereNode(int valor){
        Node novo = new Node(valor, null);
        Node ant = null;
        Node atual = head.getNext();
        Boolean inseriu = false;
        while (atual != null && atual.getInfo() <= valor){
            ant = atual;
            atual = atual.getNext();
        }
        if (ant == null){
            head.setNext(novo);
            novo.setNext(atual);
        }
        else {
            ant.setNext(novo);
            novo.setNext(atual);
        }
        inseriu = true;
    }


    public Node buscaNode(int valor) {
        Node atual = head.getNext();
        while (atual != null && atual.getInfo() <= valor) {
            if (atual.getInfo() == valor) {
                return atual;
            }
            atual = atual.getNext();
        }
        return null;
    }

    public boolean removeNode(int valor){
        Node ant = head;
        Node atual = head.getNext();
        while(atual != null){
            if (atual.getInfo() == valor){
                ant.setNext(atual.getNext());
                return true;
            }
            else {
                ant = atual;
                atual = atual.getNext();
            }
        }
        return false;
    }
    public void inserirAposPrimeiroImpar(int valor) {
        Node novo = new Node(valor, null);
        Node atual = head;
        Node ant = null;

        while (atual != null && (atual.getInfo() % 2 == 0)) {
            ant = atual;
            atual = atual.getNext();
        }

        if (atual == null) {
            if (ant == null) {
                head.setNext(novo);
            } else {
                ant.setNext(novo);
            }
        } else {
            novo.setNext(atual.getNext());
            atual.setNext(novo);
        }
    }

    public int getElemento(int indice) {
        Node atual = head.getNext();
        int contador = 0;
        while (atual != null) {
            if (contador == indice) {
                return atual.getInfo();
            }
            atual = atual.getNext();
            contador++;
        }
        throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
    }
    public boolean removeOcorrencias(int valor) {
        boolean removed = false;
        Node ant = head;
        Node atual = head.getNext();

        while (atual != null) {
            if (atual.getInfo() == valor) {
                ant.setNext(atual.getNext());
                removed = true;
            } else {
                ant = atual;
            }
            atual = atual.getNext();
        }
        return removed;
    }

    public void arrayToList(int[] vetor) {
        if (head.getNext() != null) {
            System.out.println("Operação inválida");
            return;
        }
        Node atual = head;
        for (int valor : vetor) {
            Node novo = new Node(valor, null);
            atual.setNext(novo);
            atual = novo;
        }
    }
}
