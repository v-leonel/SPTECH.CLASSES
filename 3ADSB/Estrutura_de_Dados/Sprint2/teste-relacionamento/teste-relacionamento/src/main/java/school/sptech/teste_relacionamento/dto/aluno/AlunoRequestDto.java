package school.sptech.teste_relacionamento.dto.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
public class AlunoRequestDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    @Past
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    @Positive
    private Integer idCurso;
    public AlunoRequestDto(String nome, String cpf, LocalDate dataNascimento, Integer idCurso) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Integer getIdCurso() {
        return idCurso;
    }
}
