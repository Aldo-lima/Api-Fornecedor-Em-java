package com.api.produtos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.models.Contato;
import com.api.produtos.models.Fornecedor;
import com.api.produtos.repositories.ContatoRepository;


@Service
public class ContatoService {

	@Autowired
	private ContatoRepository repository;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	public List<Contato> findAll() {
		return repository.findAll();
		
	}
	
	public Contato findById(Integer id) {
		Optional<Contato> obj = repository.findById(id);
		return obj.orElse(null);
	}
	

	public Contato create(Integer id_forn, Contato obj) {
		obj.setId(null);
		Fornecedor forn = fornecedorService.findById(id_forn);
		obj.setFornecedor(forn);
		return repository.save(obj);
	}

	public Contato update(Integer id, Contato obj) {
		Contato newObj = findById(id);
		upDate(newObj, obj);
		return repository.save(newObj);
	}
	
	
	private void upDate(Contato newObj, Contato obj) {
		newObj.setNome(obj.getNome());
		newObj.setCargo(obj.getCargo());
		newObj.setTelefone(obj.getTelefone());
		newObj.setTelefone_tipo(obj.getTelefone_tipo());
		newObj.setEmail(obj.getEmail());
		
	}

	
	public void delete(Integer id) {
		Contato obj = findById(id);
		repository.delete(obj);
	}
	
}
