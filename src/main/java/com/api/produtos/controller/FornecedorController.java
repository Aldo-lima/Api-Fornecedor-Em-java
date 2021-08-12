package com.api.produtos.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.produtos.models.Fornecedor;
import com.api.produtos.models.dto.FornecedorDTO;
import com.api.produtos.service.FornecedorService;



@RestController
@RequestMapping(value ="fornecedores")
public class FornecedorController  {
	
	@Autowired
	private FornecedorService service;
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Fornecedor>findById(@PathVariable Integer id){
		Fornecedor obj = service.findById(id);
     return ResponseEntity.ok().body(obj);
	}
	
	
	@GetMapping
	public ResponseEntity<List<FornecedorDTO>>findAll(){
		List<Fornecedor> list = service.findAll();
		List<FornecedorDTO> listDTO = list.stream().map(obj -> new FornecedorDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<Fornecedor> create(@RequestBody Fornecedor obj){
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
	   return ResponseEntity.created(uri).body(obj);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<FornecedorDTO> update(@PathVariable Integer id, @RequestBody FornecedorDTO objDto ){
		Fornecedor newObj = service.create(id, objDto);
	  return ResponseEntity.ok().body(new FornecedorDTO(newObj));
	} 
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void>delet(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
