package school.sptech.prova_ac1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuarioParaCadastrar){
        Optional<Usuario> usuarioExistenteByEmail = repository.findByEmail(usuarioParaCadastrar.getEmail());
        Optional<Usuario> usuarioExistenteByCpf = repository.findByCpf(usuarioParaCadastrar.getCpf());
        
        if(usuarioExistenteByEmail.isPresent() || usuarioExistenteByCpf.isPresent()){
            return ResponseEntity.status(409).build();
        }
        usuarioParaCadastrar.setId(null);
        Usuario usuarioSalvo = this.repository.save(usuarioParaCadastrar);
        return ResponseEntity.status(201).body(usuarioSalvo);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuario(){
        List<Usuario> todosUsuarios = this.repository.findAll();

        if(todosUsuarios.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(todosUsuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id) {
        Optional<Usuario> possivelUsuario = this.repository.findById(id);

        if (possivelUsuario.isPresent()) {
            return ResponseEntity.ok(possivelUsuario.get());
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        if (repository.existsById(id)) {
            this.repository.deleteById(id);
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/filtro-data")
    public ResponseEntity<List<Usuario>> buscarPorDataNascimentoMaiorQue(@RequestParam LocalDate dataNascimento){
        List<Usuario> usuarios = this.repository.findByDataNascimentoGreaterThan(dataNascimento);

        if(usuarios.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(usuarios);
    }
    
}
