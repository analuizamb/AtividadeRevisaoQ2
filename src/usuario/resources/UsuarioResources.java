package usuario.resources;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import usuario.models.Usuario;
import usuario.repositorys.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResources {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuario> show() {
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuario showOne(@PathVariable(value="id") long id) {
	return usuarioRepository.findById(id);
	}
	
	@PostMapping
	public Usuario create(@RequestBody @Validated Usuario usuario)
	{
	return usuarioRepository.save(usuario);
	}
	
	@PutMapping
	public Usuario update(@RequestBody @Validated Usuario usuario)
	{
	return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping
	public void delete(@RequestBody @Validated Usuario usuario)
	{
		usuarioRepository.delete(usuario);
	}
	
}