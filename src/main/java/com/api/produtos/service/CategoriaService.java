package com.api.produtos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.models.Categoria;
import com.api.produtos.repositories.CategoriaRepository;
import com.api.produtos.service.excepitions.ObjectNotFoudException;





@Service
public class CategoriaService {
	
	@Autowired
	 private CategoriaRepository repository;

	
	public Categoria create(Categoria obj) {
		obj.setId(null);
		return repository.save(obj);
	}


	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
    return obj.orElseThrow(()-> new ObjectNotFoudException("objeto não encontrado"+ id +"Tipo" + Categoria.class.getName()));

	}
	
	
	public List<Categoria> findAll() {
		return repository.findAll();
		
	}
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
		
	}
}
