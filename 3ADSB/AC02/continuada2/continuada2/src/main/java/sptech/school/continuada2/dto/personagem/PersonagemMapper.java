package sptech.school.continuada2.dto.personagem;

import sptech.school.continuada2.entity.Personagem;
import sptech.school.continuada2.entity.Regiao;

public class PersonagemMapper {


    public static Personagem toEntity(PersonagemCreateDto dto) {

        if (dto == null) {
            return null;
        }

        // TODO: Implementar mapeamento de PersonagemCreateDto para Personagem

        return Personagem.builder()
                // TODO: Completar o de-para dos atributos
                .nome(dto.getNome())
                .ultimate(dto.getUltimate())
                .funcaoPrincipal(dto.getFuncaoPrincipal())
                .regiao(dto.getRegiaoId() == 0 ? null : Regiao.builder().id(dto.getRegiaoId()).build())
                .build();
    }

    public static PersonagemResponseDto toDto(Personagem entity) {

        if (entity == null) {
            return null;
        }

        // TODO: Implementar mapeamento de Regiao para RegiaoPersonagemResponseDto (classe interna de PersonagemResponseDto)
        PersonagemResponseDto.RegiaoPersonagemResponseDto regiaoDto =
                PersonagemResponseDto.RegiaoPersonagemResponseDto.builder()
                        .id(entity.getRegiao().getId())
                        .nome(entity.getRegiao().getNome())
                        .descricao(entity.getRegiao().getDescricao())
                        .sigla(entity.getRegiao().getSigla())
                        .build();

        // TODO: Implementar mapeamento de Personagem para PersonagemResponseDto
        return PersonagemResponseDto.builder()
                // TODO: Completar o de-para dos atributos
                .id(entity.getId())
                .nome(entity.getNome())
                .ultimate(entity.getUltimate())
                .funcaoPrincipal(entity.getFuncaoPrincipal())
                .regiao(regiaoDto)
                .build();
    }

    public static PersonagemResponseDto toResponseDto(Personagem personagemSalva) {
        return toDto(personagemSalva);
    }
}
