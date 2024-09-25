public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);
        lista.adiciona(40);
        lista.adiciona(50);
        lista.exibe();
        System.out.println("Posição do elemento 30: " + lista.busca(30));
        System.out.println("Posição do elemento 60: " + lista.busca(60));
        lista.removePeloIndice(1);
        lista.exibe();
        lista.removeElemento(true);
        lista.exibe();
    }
}
