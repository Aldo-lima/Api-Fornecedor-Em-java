package com.api.produtos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.models.Enderecof;
import com.api.produtos.models.Fornecedor;
import com.api.produtos.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	
	@Autowired
	private EnderecoRepository repository;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	public List<Enderecof> findAll() {
		return repository.findAll();
		
	}
	
	public Enderecof findById(Integer id) {
		Optional<Enderecof> obj = repository.findById(id);
		return obj.orElse(null);
	}
	

	public Enderecof create(Integer id_forn, Enderecof obj) {
		obj.setId(null);
		Fornecedor forn = fornecedorService.findById(id_forn);
		obj.setFornecedor(forn);
		return repository.save(obj);
	}
	
	public Enderecof update(Integer id, Enderecof obj) {
		Enderecof newObj = findById(id);
		upDate(newObj, obj);
		return repository.save(newObj);
	}
	
	
	private void upDate(Enderecof newObj, Enderecof obj) {
		newObj.setRua(obj.getRua());
		newObj.setBairro(obj.getBairro());
		newObj.setCidade(obj.getCidade());
		newObj.setEstado(obj.getEstado());
		newObj.setProximidade(obj.getProximidade());
		newObj.setCep(obj.getCep());
		
	}


	
	public void delete(Integer id) {
		Enderecof obj = findById(id);
		repository.delete(obj);
	}
}
