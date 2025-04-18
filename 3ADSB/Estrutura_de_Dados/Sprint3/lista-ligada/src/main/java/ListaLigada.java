public class ListaLigada {
    private Node head;

    public ListaLigada() {
    }

    public Node getHead() {
        return head;
    }

    void insereNode(int valor){
        Node novo = new Node(valor, null);
        if (head == null){
            head = novo;
        }
        else {
            Node aux = head;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(novo);
        }
    }
    void exibe(){
        Node atual = head.getNext();
        while(atual != null){
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public Node buscaNode(int valor){
        Node atual = head.getNext();
        while(atual != null){
            if(atual.getInfo() == valor){
                return atual;
            }
            else {
                atual = atual.getNext();
            }
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

    public int getTamanho(){
        Node atual = head.getNext();
        int tam = 0;
        while(atual != null){
            tam = tam = 1;
            atual = atual.getNext();
        }
        return tam;
    }

}
