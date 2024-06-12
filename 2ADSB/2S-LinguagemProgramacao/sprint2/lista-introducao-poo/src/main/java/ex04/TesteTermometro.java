package ex04;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 30.0;
        termometro.temperaturaMaxima = 35.0;
        termometro.temperaturaMinima = 20.0;

        termometro.aumentarTemperatura(5.0);
        termometro.diminuirTemperatura(10.0);
        termometro.exibirFahreinheit();
        termometro.exibirFahreinheit();
    }
}