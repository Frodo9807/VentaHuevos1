package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import modelo.Venta;
import rest.ArticuloService;
import rest.VentasService;
import modelo.Articulo;

@RestController
public class ControladorVentas {
	
	@Autowired
	private ArticuloService servicearticulo;
	@Autowired
	private VentasService serviceventa;

	

	@GetMapping("/")
	public String hola() {
		return "hola a todos";
	}

	@GetMapping("/articulos")
	public String articulos(Model modelo) {
		List<Articulo> articulos = servicearticulo.listar();
		modelo.addAttribute("articulos", articulos);

		return "lista_articulos";
	}

	@GetMapping("/ventas")
	public String venta(Model modelo) {
		List<Venta> venta = serviceventa.listar();
		modelo.addAttribute("estudiantes", venta);

		return "lista_ventas";
	}

	@PostMapping("/agregarventa")
	public String guardar(Venta venta) {
		venta.setTotal(venta.getCantidad());
		serviceventa.save(venta);
		return "lista_articulos";
	}
	@PostMapping("/agregararticulo")
	public String guardararticulos(Articulo articulo) {
		servicearticulo.save(articulo);
		return "lista_ventas";
	}

}
