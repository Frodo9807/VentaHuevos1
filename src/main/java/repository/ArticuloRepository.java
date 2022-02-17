package repository;

import modelo.Articulo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Integer>{

}
