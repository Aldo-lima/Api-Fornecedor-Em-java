package com.api.produtos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.models.Fornecedor;
import com.api.produtos.models.Product;
import com.api.produtos.repositories.ProductRepository;




@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	public List<Product> findAll() {
		return repository.findAll();
		
	}
	
	public Product findById(Integer id) {
		Optional<Product> obj = repository.findById(id);
		return obj.orElse(null);
	}
	

	public Product create(Integer id_forn, Product obj) {
		obj.setId(null);
		Fornecedor forn = fornecedorService.findById(id_forn);
		obj.setFornecedor(forn);
		return repository.save(obj);
	}

	public Product update(Integer id, Product obj) {
		Product newObj = findById(id);
		upDate(newObj, obj);
		return repository.save(newObj);
	}
	
	
	private void upDate(Product newObj, Product obj) {
		newObj.setName(obj.getName());
		newObj.setPrice(obj.getPrice());
		newObj.setDescricao(obj.getDescricao());
		
	}

	
	public void delete(Integer id) {
		Product obj = findById(id);
		repository.delete(obj);
	}
	
		

}
