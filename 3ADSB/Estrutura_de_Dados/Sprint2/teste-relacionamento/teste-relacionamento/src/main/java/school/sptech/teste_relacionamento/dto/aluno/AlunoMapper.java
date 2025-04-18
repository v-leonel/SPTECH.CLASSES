package school.sptech.teste_relacionamento.dto.aluno;

import school.sptech.teste_relacionamento.entity.Aluno;

public class AlunoMapper {
    public static AlunoResumoDto toAlunoResumoDto(Aluno entity) {
        if (entity == null) {
            return null;
        }
        return AlunoResumoDto.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .build();
    }

    public static AlunoDetalheDto toAlunoDetalheDto(Aluno entity) {
        if (entity == null) {
            return null;
        }
        return null;
    }
    public static Aluno toEntity(AlunoRequestDto dto){
        if (dto == null) {
            return null;
        }
        return Aluno.builder()
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .dataNascimento(dto.getDataNascimento())
                .build();
    }
}