package school.sptech.teste_relacionamento.entity;

public class CursoCadastradoDto {
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;

    public CursoCadastradoDto(Integer id, String nome, String descricao, Double preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
}
