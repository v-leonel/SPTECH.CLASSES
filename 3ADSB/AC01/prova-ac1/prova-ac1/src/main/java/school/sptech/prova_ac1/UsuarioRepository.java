package school.sptech.prova_ac1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByid(Usuario usuarioParaCadastrar);
    Optional<Usuario> findByCpf(String cpf);
    Optional<Usuario> findByEmail(String email);
    List<Usuario> findByDataNascimentoGreaterThan(LocalDate dataNascimento);
}
