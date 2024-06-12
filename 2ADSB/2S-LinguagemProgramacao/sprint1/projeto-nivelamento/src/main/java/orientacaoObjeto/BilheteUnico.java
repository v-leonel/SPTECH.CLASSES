package orientacaoObjeto;

public class BilheteUnico {

    // Atributos
    String codigo;
    String nomeTitular;
    Double saldo;

    // Métodos;
     void carregar(Double valor){
        if (valor <= 0) {
            System.out.println("Valor de recarga inválido");
        } else {
            saldo += valor;
            System.out.println("Recarga efetuada");
        }
    }
}
