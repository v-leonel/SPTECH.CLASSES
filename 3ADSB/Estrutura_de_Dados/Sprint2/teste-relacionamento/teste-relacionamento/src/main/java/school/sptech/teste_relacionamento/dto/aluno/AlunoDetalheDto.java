package school.sptech.teste_relacionamento.dto.aluno;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

public class AlunoDetalheDto {
    private Integer id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private AlunoCursoDto curso;

    @Data
    @Builder
    public static class AlunoCursoDto{
        private Integer id;
        private String nome;
        private String descricao;
        private Double preco;
        private String categoria;
    }
}
