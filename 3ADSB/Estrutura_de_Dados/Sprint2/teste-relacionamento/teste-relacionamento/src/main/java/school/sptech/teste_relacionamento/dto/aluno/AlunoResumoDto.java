package school.sptech.teste_relacionamento.dto.aluno;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlunoResumoDto {
    private Integer id;
    private String nome;
    private String email;

    public AlunoResumoDto(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}