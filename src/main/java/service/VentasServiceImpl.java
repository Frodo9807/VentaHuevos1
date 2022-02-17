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
public class VentasServiceImpl implements VentasService{
    @Autowired
    private VentaRepository data;
    

    @Override
    @Transactional
    public List<Venta>listar(){
        List <Venta> listaVentas = (List<Venta>) data.findAll();
        return listaVentas;
    }


	@Override
	@Transactional
	public Optional<Venta> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@Transactional
	public int save(Venta e) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


    
}
