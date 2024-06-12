import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.now();

        System.out.println(data);
        System.out.println(dataHora);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatador.format(dataHora));

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma data e hora");
        String dataTexto = leitor.nextLine();

        LocalDateTime dataDigitada = LocalDateTime.parse(dataTexto, formatador);

        System.out.println(dataDigitada);
    }
}
