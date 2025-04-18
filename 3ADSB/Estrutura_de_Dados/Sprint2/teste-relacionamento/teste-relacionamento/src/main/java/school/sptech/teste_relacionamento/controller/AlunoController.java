package school.sptech.teste_relacionamento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.teste_relacionamento.dto.aluno.AlunoDetalheDto;
import school.sptech.teste_relacionamento.dto.aluno.AlunoMapper;
import school.sptech.teste_relacionamento.dto.aluno.AlunoResumoDto;
import school.sptech.teste_relacionamento.entity.Aluno;
import school.sptech.teste_relacionamento.service.AlunoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

//    @Autowired
    private final AlunoService alunoService;

//    public AlunoController(AlunoService alunoService) {
//        this.alunoService = alunoService;
//    }

    @GetMapping
    public ResponseEntity<List<AlunoResumoDto>> listagem(){
        List<AlunoResumoDto> dtos = new ArrayList<>();

        for(Aluno alunoDaVez : alunoService.listar()){
            dtos.add(AlunoMapper.toAlunoResumoDto(alunoDaVez));
        }
//        return ResponseEntity.status(200).body(dtos);
        return ResponseEntity.ok(dtos);
    }
    @GetMapping
    public ResponseEntity<?> buscarPorId(@PathVariable int id){
        Aluno entidade = alunoService.buscarPorId(id);
        AlunoDetalheDto alunoDetalheDto =  AlunoMapper.toAlunoDetalheDto(entidade);
        return ResponseEntity.ok(entidade);
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(){
        return null;

        Aluno alunoEntidade = AlunoMapper.toEntity(alunoRequestDto);
        Aluno alunoCadastrado = alunoService.cadastrar(alunoEntidade);
        AlunoDetalheDto alunoDetalheDto = AlunoMapper.toAlunoDetalheDto(alunoCadastrado);
    }
}
