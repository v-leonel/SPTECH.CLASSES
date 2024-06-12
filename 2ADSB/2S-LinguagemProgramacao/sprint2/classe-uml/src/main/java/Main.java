public class Main {
    public static void main(String[] args) {
        Atividade atividade01 = new Atividade("Tomar banho", "Victor", 3, 0);

        System.out.println(
                """
                        Nome atividade: %s
                        Responsável: %s
                        Dias estimados: %d
                        Dias usados: %d
                        """.formatted(atividade01.getNomeAtividade(),
                        atividade01.getResponsavel(),
                        atividade01.getDiasEstimados(),
                        atividade01.getDiasUsados()));

        atividade01.terminarAtividade(5);

        System.out.println("Depois de terminar: \n\n");
        System.out.println(atividade01);
    }
}
