package ex01;

public class Bolo {
    String sabor;

    Double valor;

    Integer quantidadeVendida = 0;

    void comprarBolo(Integer quantidadeDesejada){
        if(quantidadeDesejada > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diÃ¡rio para esse bolo");
            return;
        }
        quantidadeVendida += quantidadeDesejada;
    }

    void exibirRelatorio(){
        System.out.println("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f".formatted(this.sabor, this.quantidadeVendida, this.quantidadeVendida*this.valor));
    }
}