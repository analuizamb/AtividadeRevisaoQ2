package usuario.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import usuario.models.Usuario;
import usuario.resources.Aula;

public interface UsuarioRepository extends JpaRepository<Usuario, long> {
	Usuario findById(long id);

	List<Usuario> findAll();

	Usuario save(Usuario usuario);

	void delete(Usuario usuario);
}

