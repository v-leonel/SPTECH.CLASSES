package school.sptech.teste_relacionamento.entity;

public class Main {
    public static Curso toEntity(CursoCadastradoDto dto){
        return Curso.builder()
            .id(dto.getId())
            .nome(dto.getNome())
            .descricao(dto.getDescricao())
            .preco(dto.getPreco())
            .categoria(dto.getCategoria())
            .build();

//        Curso c1 = new Curso();
//
//        c1.setId(dto.getId());
//        c1.setNome(dto.getNome());
//        c1.setDescricao(dto.getDescricao());
//        c1.setPreco(dto.getPreco());
//        c1.setCategoria(dto.getCategoria());

    }
}
