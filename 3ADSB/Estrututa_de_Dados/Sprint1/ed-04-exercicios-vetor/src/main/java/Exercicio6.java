import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia (número de 1 a 31):");
        int dia = scan.nextInt();
        System.out.println("Digite o mês (número de 1 a 12):");
        int mes = scan.nextInt();

        int diaDoAno = 0;

        for(int i = 0; i < mes - 1; i++){
            diaDoAno += diasPorMes[i];
        }
        diaDoAno += dia;

        System.out.println("O dia " + dia + "/" + mes + " corresponde ao dia " + diaDoAno + " do ano.");

        scan.close();
    }
}
