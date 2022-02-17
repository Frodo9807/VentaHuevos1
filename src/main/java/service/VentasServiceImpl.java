package service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Venta;
import repository.VentaRepository;
import rest.VentasService;


@Service
@Transactional
public class VentasServiceImpl implements VentasService{
    @Autowired
    private VentaRepository data;
    

    @Override
    public List<Venta>listar(){
        List <Venta> listaVentas = (List<Venta>) data.findAll();
        return listaVentas;
    }


	@Override
	public Optional<Venta> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int save(Venta e) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


    
}
