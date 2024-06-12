public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloquedo;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloquedo = false;
    }

    public void bloquear(){
        bloquedo = true;
    }
    public void desbloquear(){
        bloquedo = false;
    }

    public Contato() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloquedo() {
        return bloquedo;
    }

    @Override
    public String toString(){
        String fraseBloq = bloquedo ? "Sim" : "Não";
        return """
                nome: %s
                Tefelone: %s
                Bloqueado: %s
                """.formatted(nome, telefone, (bloquedo ? "Sim" : "Não"));
    }
}
