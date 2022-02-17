package rest;

import java.util.List;
import java.util.Optional;

import modelo.Articulo;

public interface ArticuloService {
	public List<Articulo>listar();
	public Optional<Articulo>listarId(int id);
	public int save(Articulo p);
	public void delete(int id);
}
