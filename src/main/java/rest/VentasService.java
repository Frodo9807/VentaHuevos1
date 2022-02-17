package rest;

import java.util.List;
import java.util.Optional;

import modelo.Venta;

public interface VentasService {
	public List<Venta>listar();
	public Optional<Venta>listarId(int id);
	public int save(Venta e);
	public void delete(int id);
}
