package school.sptech.teste_relacionamento.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf; // VARCHAR NO BANCO
    private LocalDate dataNascimento;

    /*
        @OneToMany
        @ManyToOne // 80%
        @OneToOne
        @ManyToMany // associativa
    */

    @ManyToOne // sempre será obj
    private Curso curso; // curso_id

    /*
       class AlunoCriacaoDto{
            private String nome;
            private String cpf;
            private LocalDate dataNascimento;
            private Integer cursoId;
        }
    */

//    private Integer cursoId;
}
