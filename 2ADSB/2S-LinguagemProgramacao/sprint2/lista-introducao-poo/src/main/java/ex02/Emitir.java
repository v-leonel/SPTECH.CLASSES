package ex02;

public class Emitir {
    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda();
        encomenda1.tamanho = "P";
        encomenda1.enderecoRemetente = "Avenida jaabaquara, 1178";
        encomenda1.enderecoDestinatario = "Rua das Flores, 456";
        encomenda1.distancia = 30.0;
        encomenda1.valorEncomenda = 100.0;

        Encomenda encomenda2 = new Encomenda();
        encomenda2.tamanho = "M";
        encomenda2.enderecoRemetente = "Rua das Flores, 789";
        encomenda2.enderecoDestinatario = "Rua das Flores, 101112";
        encomenda2.distancia = 100.0;
        encomenda2.valorEncomenda = 200.0;

        Encomenda encomenda3 = new Encomenda();
        encomenda3.tamanho = "G";
        encomenda3.enderecoRemetente = "Rua das Flores, 131415";
        encomenda3.enderecoDestinatario = "Rua das Flores, 161718";
        encomenda3.distancia = 300.0;
        encomenda3.valorEncomenda = 300.0;

        encomenda1.emitirEtiqueta();
        encomenda2.emitirEtiqueta();
        encomenda3.emitirEtiqueta();
    }
}