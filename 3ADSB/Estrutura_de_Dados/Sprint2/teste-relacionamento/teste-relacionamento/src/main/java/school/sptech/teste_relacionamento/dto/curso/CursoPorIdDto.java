package school.sptech.teste_relacionamento.dto.curso;

import lombok.Data;

@Data
public class CursoPorIdDto {

    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;

    // Campo calculado ou campo virtual
    // Qdo gerar informação e nao somente apresentar o dado
    public String getValorFormatado(){
        return "%.2f".formatted(preco);
    }
}
