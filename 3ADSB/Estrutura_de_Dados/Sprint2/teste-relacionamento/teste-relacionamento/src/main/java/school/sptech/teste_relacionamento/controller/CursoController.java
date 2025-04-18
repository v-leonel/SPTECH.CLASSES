package school.sptech.teste_relacionamento.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.teste_relacionamento.dto.curso.CursoCadastroDto;
import school.sptech.teste_relacionamento.dto.curso.CursoMapper;
import school.sptech.teste_relacionamento.dto.curso.CursoPorIdDto;
import school.sptech.teste_relacionamento.dto.curso.CursoResumoDto;
import school.sptech.teste_relacionamento.entity.Curso;
import school.sptech.teste_relacionamento.service.CursoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<CursoResumoDto> cadastro(
            @RequestBody @Valid CursoCadastroDto cursoDto
    ) {

        // Convertemos para entidade
        Curso cursoEntidade = CursoMapper.toEntity(cursoDto);
        // Acionamos o serviço
        Curso cursoSalvo = this.cursoService.cadastrar(cursoEntidade);
        // Convertemos para outra DTO
        CursoResumoDto resumoDto = CursoMapper.toResumoDto(cursoSalvo);

        return ResponseEntity.status(201).body(resumoDto);
    }

    @GetMapping
    public ResponseEntity<List<CursoResumoDto>> listagem() {
        List<Curso> listagem = cursoService.listar();

        if (listagem.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        /*
            JAVA STREAM API:
                - map (mapear um obj para outro)
                - filter (filtrar uma lista ou colecao de obj)
                - reduce (sumarizar, acumular)

            Existe inclusive no JS;

            SAM
            single
            abstract
            method
        */

        List<CursoResumoDto> convertidos = new ArrayList<>();

        // For aprimorado
        for(Curso cursoDaVez : listagem){
            CursoResumoDto resumoDto = CursoMapper.toResumoDto(cursoDaVez);
            convertidos.add(resumoDto);
        }

//        List<CursoResumoDto> convertidos = listagem.stream()
//                .map(curso -> CursoMapper.toResumoDto(curso))
//                .toList();

        return ResponseEntity.status(200).body(convertidos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursoPorIdDto> buscarPorId(@PathVariable Integer id) {
        Curso curso = this.cursoService.buscarPorId(id);
        CursoPorIdDto cursoIdDto = CursoMapper.toCursoIdDto(curso);
        return ResponseEntity.status(200).body(cursoIdDto);
    }
}
