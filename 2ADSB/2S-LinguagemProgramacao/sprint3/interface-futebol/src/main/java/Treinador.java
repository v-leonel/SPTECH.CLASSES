public class Treinador implements Treinavel {
    private String nome;
    private Integer tempoExperiencia;

    public Treinador(String nome, Integer tempoExperiencia) {
        this.nome = nome;
        this.tempoExperiencia = tempoExperiencia;
    }

    @Override
    public void treinar() {
        System.out.println(nome + " está treinando a equipe com " + tempoExperiencia + " anos de experiência.");
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getExperiencia() {
        return tempoExperiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.tempoExperiencia = experiencia;
    }
}
