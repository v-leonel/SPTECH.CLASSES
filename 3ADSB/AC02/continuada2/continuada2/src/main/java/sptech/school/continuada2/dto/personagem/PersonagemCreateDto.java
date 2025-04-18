package sptech.school.continuada2.dto.personagem;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PersonagemCreateDto {
    //TODO: Implementar validações
    @NotBlank(message = "Nome não pode ser vazio ou conter espaços em branco")
    @NotNull(message = "Nome não pode ser nulo")
    private String nome;

    @NotBlank(message = "Ultimate não pode ser vazio ou conter espaços em branco")
    private String ultimate;

    @NotBlank(message = "Função principal não pode ser vazia ou conter espaços em branco")
    @NotEmpty(message = "Função principal não pode ser vazia")
    private String funcaoPrincipal;

    @NotNull(message = "ID da região não pode ser nulo")
    @Positive(message = "ID da região deve ser um número positivo")
    private int regiaoId;


}
