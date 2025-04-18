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

            System.out.println("Removendo elemento da posição 1");
            lista.removePeloIndice(1);
            lista.exibe();

            System.out.println("Removendo elemento 30");
            lista.removeElemento(30);
            lista.exibe();

            System.out.println("Substituindo um valor antigo por um novo");
            lista.substitui(40, 60);
            lista.exibe();

            System.out.println("Contando ocorrências do número 10");
            lista.contaOcorrencias(10);

            System.out.println("Adicionando elemento no início da lista");
            lista.adicionaNoInicio(5);
            lista.exibe();

            System.out.println("---------------------");
            System.out.println("Testando lista estatica ordenada");

            ListaEstaticaOrdenada listaOrdenada = new ListaEstaticaOrdenada(5);
            listaOrdenada.adiciona(20);
            listaOrdenada.exibe();
            listaOrdenada.adiciona(5);
            listaOrdenada.exibe();
            listaOrdenada.adiciona(10);
            listaOrdenada.exibe();
            listaOrdenada.adiciona(25);
            listaOrdenada.exibe();
            listaOrdenada.adiciona(2);
        }
    }
