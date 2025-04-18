package school.sptech.teste_relacionamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter // getters
@Setter // setters
@Builder
@NoArgsConstructor // construtor vazio
@AllArgsConstructor // construtor cheio
//@RequiredArgsConstructor // gera um construtor que contem somente args constantes
//@ToString
//@Data = Faz tudo a respeito de boilerplate, nao utilizar em entidades.
public class Curso {

    /*
        Cuidado ao usar com LOMBOK:
        Model mapper -> importar uma configuração
        Mapper Struct -> importar uma configuração
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private String categoria; //enumerador
}
