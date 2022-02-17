package repository;

import modelo.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
	Usuario findByNOMBRE(String nombre);
}
