package school.sptech.lista01;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double valorUnitarioProduto = 0.0;
        Integer qtdProduto = 0;
        Double valorPagoPeloCliente = 0.0;

        System.out.println("Insira o valor unitário do produto.");
        valorUnitarioProduto = scan.nextDouble();

        System.out.println("Insira a quantidade do produto.");
        qtdProduto = scan.nextInt();

        System.out.println("Insira o valor pago pelo cliente.");
        valorPagoPeloCliente = scan.nextDouble();

        Double totalCompra = valorUnitarioProduto * qtdProduto;
        Double troco = valorPagoPeloCliente - totalCompra;

        if (valorPagoPeloCliente > totalCompra){
            System.out.printf("Seu troco será de R$ %s.", troco);
        }
        else if(valorPagoPeloCliente.equals(totalCompra)){
            System.out.println("Obrigado pela compra, sem troco para receber.");
        }
        else {
            System.out.println("Não é possível realizar a compra, valor insuficiente.");
        }
    }
}
