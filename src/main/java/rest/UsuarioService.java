package rest;
import java.util.List;
import java.util.Optional;

import modelo.Usuario;
public interface UsuarioService {
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario cal);
	public void delete(int id);
}
