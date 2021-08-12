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

import com.api.produtos.models.Enderecof;
import com.api.produtos.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	
	@Autowired
	private EnderecoService service;
	
	@GetMapping
	public ResponseEntity<List<Enderecof>>findAll(){
		List<Enderecof> listEnderecof = service.findAll();
		 return ResponseEntity.ok().body(listEnderecof);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Enderecof> findByid(@PathVariable Integer id){
		Enderecof obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Enderecof> create(@RequestParam(value = "fornecedor", defaultValue = "0") Integer id_forn,
		@RequestBody Enderecof obj ){
		Enderecof newObj  = service.create(id_forn, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/Enderecof{id}").buildAndExpand(newObj.getId()).toUri();
	   return ResponseEntity.created(uri).build();
	}
	
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Enderecof> update(@PathVariable Integer id, @RequestBody Enderecof obj){
	Enderecof newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
