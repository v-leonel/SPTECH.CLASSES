public class Main {
    public static void main(String[] args) {
        Treinador treinador = new Treinador("Leonel", 10);

        Time time = new Time("Paysandu");
        time.adicionarMembro(treinador);

        Campeonato campeonato = new Campeonato("Champions League");
        campeonato.adicionarTime(time);

        campeonato.treinarCampeonato();
    }
}
