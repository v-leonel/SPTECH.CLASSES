public class Main {
    public static void main(String[] args) {
        String nome1 = "José";
        String nome2 = "Maria";

        int ra1 = 50000;
        int ra2 = 50001;
        Double nota1 = 9.5;
        Double nota2 = 8.0;

        System.out.printf("---------------------------------------\n");
        System.out.printf("%5S %-7S %4S\n", "ra", "nome", "nota");
        System.out.printf("%5d %-7s %4.2f\n", ra1, nome1, nota1);
        System.out.printf("%5S %-7S %4S\n", ra2, nome2, nota2);
    }
}
