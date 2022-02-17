package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.Usuario;
import repository.UsuarioRepository;
import rest.UsuarioService;
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository data;
	
	@Override
	public List<Usuario> listar() {
		List<Usuario> listaUsuario=(List<Usuario>)data.findAll();
		return listaUsuario;
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Usuario cal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
