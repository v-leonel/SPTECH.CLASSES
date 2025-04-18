package school.sptech.teste_relacionamento.dto.curso;

import lombok.Builder;
import lombok.Data;

@Data// Record dispensa lombok
@Builder
public class CursoResumoDto {
    private Integer id;
    private String nome;
}
