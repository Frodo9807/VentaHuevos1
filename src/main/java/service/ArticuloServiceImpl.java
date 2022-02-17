package service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.Articulo;
import repository.ArticuloRepository;
import rest.ArticuloService;

@Service

public class ArticuloServiceImpl implements ArticuloService{
    @Autowired
    private ArticuloRepository data;

    @Override
    @Transactional(readOnly=true)
    public List<Articulo>listar(){
        List <Articulo> listaArticulo = (List<Articulo>) data.findAll();
        return listaArticulo;
    }

	@Override
	@Transactional
	public Optional<Articulo> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public int save(Articulo p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
    


    
}
