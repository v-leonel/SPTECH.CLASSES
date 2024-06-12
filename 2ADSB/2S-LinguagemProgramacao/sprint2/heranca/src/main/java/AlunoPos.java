public class AlunoPos extends Aluno {

    private Double notaArtigo;

    public AlunoPos(String nome, Double notaContinuada, Double notaEntrega){
        super(nome, notaContinuada, notaEntrega);
        this.notaArtigo = notaArtigo;
    }

    public AlunoPos() {
    }

    @Override
    public Double calcularNotaFinal() {
        return super.calcularNotaFinal() + notaArtigo;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s" +
                "Nota Continuada: %.2f" +
                "Nota Entrega: %.2f" +
                "Nota Artigo: %.2f", getNome(), getNotaContinuada(), getNotaEntrega(), notaArtigo);
    }

}
