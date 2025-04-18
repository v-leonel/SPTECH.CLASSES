package school.sptech.teste_relacionamento.dto.curso;

import school.sptech.teste_relacionamento.entity.Curso;

import java.util.Objects;

public class CursoMapper {

    public static Curso toEntity(CursoCadastroDto dto) {

        if (dto == null) {
            return null;
        }

        return Curso.builder()
                .nome(dto.getNome())
                .categoria(dto.getCategoria())
                .descricao(dto.getDescricao())
                .preco(dto.getPreco())
                .build();

//        Curso c1 = new Curso();
//
//        c1.setNome(dto.getNome());
//        c1.setCategoria(dto.getCategoria());
//        c1.setDescricao(dto.getDescricao());
//        c1.setPreco(dto.getPreco());
//
//        return c1;
    }

    public static CursoResumoDto toResumoDto(Curso entidade) {

        if (entidade == null) {
            return null;
        }

        return new CursoResumoDto(
                entidade.getId(),
                entidade.getNome())
                ;
//        return CursoResumoDto.builder()
//                .id(entidade.getId())
//                .nome(entidade.getNome())
//                .build();
    }

    public static CursoPorIdDto toCursoIdDto(Curso entidade) {
        if (Objects.isNull(entidade)) {
            return null;
        }

        CursoPorIdDto porIdDto = new CursoPorIdDto();

        porIdDto.setId(entidade.getId());
        porIdDto.setNome(entidade.getNome());
        porIdDto.setCategoria(entidade.getCategoria());
        porIdDto.setDescricao(entidade.getDescricao());
        porIdDto.setPreco(entidade.getPreco());

        return porIdDto;
    }
}
