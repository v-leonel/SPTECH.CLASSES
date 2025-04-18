public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        // Inserindo valores
        lista.insereNode(10);
        lista.insereNode(20);
        lista.insereNode(30);
        lista.insereNode(40);

        // Exibindo valores
        System.out.println("Valores na lista após inserção:");
        lista.exibe();

        // Testando buscaNode
        System.out.println("Buscando valor 20:");
        Node encontrado = lista.buscaNode(20);
        System.out.println(encontrado != null ? "Valor encontrado: " + encontrado.getInfo() : "Valor não encontrado");

        // Testando removeNode
        System.out.println("Removendo valor 30:");
        boolean removido = lista.removeNode(30);
        System.out.println(removido ? "Valor removido com sucesso" : "Valor não encontrado");
        System.out.println("Valores na lista após remoção:");
        lista.exibe();

        // Testando getTamanho
        System.out.println("Tamanho da lista:");
        System.out.println(lista.getTamanho());

        // Testando ListaLigadaOrdenada
        ListaLigadaOrdenada listaOrdenada = new ListaLigadaOrdenada();
        listaOrdenada.insereNode(10);
        listaOrdenada.insereNode(30);
        listaOrdenada.insereNode(20);

        System.out.println("Valores na lista ordenada:");
        listaOrdenada.exibe();

        System.out.println("Buscando valor 20:");
        Node encontradoOrdenado = listaOrdenada.buscaNode(20);
        System.out.println(encontradoOrdenado != null ? "Valor encontrado: " + encontradoOrdenado.getInfo() : "Valor não encontrado");

        System.out.println("Removendo valor 30:");
        boolean removidoOrdenado = listaOrdenada.removeNode(30);
        System.out.println(removidoOrdenado ? "Valor removido com sucesso" : "Valor não encontrado");
        System.out.println("Valores na lista ordenada após remoção:");
        listaOrdenada.exibe();

        System.out.println("Tamanho da lista ordenada:");
        System.out.println(listaOrdenada.getTamanho());
    }
}
