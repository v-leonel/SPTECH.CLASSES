package school.sptech.teste_relacionamento.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.sptech.teste_relacionamento.entity.Aluno;
import school.sptech.teste_relacionamento.repository.AlunoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }
    public Aluno buscarPorId(int id){
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

//        Optional<Aluno> opt = alunoRepository.findById(id);
//
//        if (opt.isPresent()){
//            return opt.get();
//        } else{
//            throw new RuntimeException("Aluno não encontrado");
//        }
    }

    public Aluno cadastrar(Aluno alunoEntidade, )
}
