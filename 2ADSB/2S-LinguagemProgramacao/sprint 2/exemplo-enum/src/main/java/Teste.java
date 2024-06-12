import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nomeDigitado =  leitorNl.nextLine();

        System.out.println("Digite a altura");
        Double alturaDigitada = leitorNl.nextDouble();

        System.out.println("Digite o peso");
        Double pesoDigitado = leitorNl.nextDouble();

        System.out.println("Digite o plano escolhido(Bronze, Prata ou Ouro)");
        String planoDigitado = leitor.next();

        Plano planoEscolhido = null;
        for(Plano planoDaVez : Plano.values()){
            if(planoDaVez.getDescricao().equals(planoDigitado)){
                planoEscolhido = planoDaVez;
            }
        }

        if(planoEscolhido == null){
            System.out.println("Erro no cadastro, plano inválido!");
        }

        Cliente cliente = new Cliente(nomeDigitado, alturaDigitada, pesoDigitado, planoDigitado);
        System.out.println("Cliente cadastrado");
        System.out.println(cliente);
    }
}
