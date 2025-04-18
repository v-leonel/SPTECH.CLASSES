public class Animal {
    private Integer id;
    private String nome;
    private int idade;
    private boolean domestico;
    private char sexo;

    public Animal(Integer id, String nome, int idade, boolean domestico, char sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.domestico = domestico;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %10d %10b %10c", id, nome, idade, domestico, sexo);
    }
}
