package com.api.produtos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.produtos.models.Contato;
import com.api.produtos.models.Fornecedor;


public interface  ContatoRepository extends CrudRepository<Contato, Integer> {
	List<Contato>findAll();
	
	
}
