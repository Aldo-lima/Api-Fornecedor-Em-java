package com.api.produtos.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.produtos.models.Product;
import com.api.produtos.service.ProductService;

@RestController
@RequestMapping(value = "/produtos")
public class ProductController {

	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>>findAll(){
		List<Product> listProduct = service.findAll();
		 return ResponseEntity.ok().body(listProduct);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findByid(@PathVariable Integer id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Product> create(@RequestParam(value = "fornecedor", defaultValue = "0") Integer id_cat,
		@RequestBody Product obj ){
		Product newObj  = service.create(id_cat, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/producit{id}").buildAndExpand(newObj.getId()).toUri();
	   return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Product> update(@PathVariable Integer id, @RequestBody Product obj){
	Product newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
}
