package com.api.produtos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.models.Fornecedor;
import com.api.produtos.models.dto.FornecedorDTO;
import com.api.produtos.repositories.FornecedorRepository;
import com.api.produtos.service.excepitions.ObjectNotFoudException;

@Service
public class FornecedorService {

	 @Autowired
	 private FornecedorRepository repository;
	 
		 
		public Fornecedor findById(Integer id) {
			Optional<Fornecedor> obj = repository.findById(id);
	    return obj.orElseThrow(()-> new ObjectNotFoudException("objeto não encontrado"+ id +"Tipo" + Fornecedor.class.getName()));

		}
	
		public List<Fornecedor> findAll() {
			return repository.findAll();
			
		}
		
		
		public Fornecedor create(Fornecedor obj) {
			obj.setId(null);
			return repository.save(obj);
		}
		public Fornecedor create(Integer id, FornecedorDTO objDto) {
			Fornecedor obj = findById(id);
			obj.setNome(objDto.getNome());
			obj.setInsc_esta(obj.getInsc_esta());
			obj.setCnpj(objDto.getCnpj());
			return repository.save(obj);
		}
		
		public void delete(Integer id) {
			findById(id);
			repository.deleteById(id);
			
		}
		
		
}
