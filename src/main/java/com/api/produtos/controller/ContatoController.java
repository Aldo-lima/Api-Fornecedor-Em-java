package com.api.produtos.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import com.api.produtos.models.Contato;
import com.api.produtos.service.ContatoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService service;
	

	//Listar contatos
	@GetMapping
	public ResponseEntity<List<Contato>>findAll(){
		List<Contato> listContato = service.findAll();
		 return ResponseEntity.ok().body(listContato);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Contato> findByid(@PathVariable Integer id){
		Contato obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Contato> create(@RequestParam(value = "fornecedor", defaultValue = "0") Integer id_forn,
		@RequestBody Contato obj ){
		Contato newObj  = service.create(id_forn, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/producit{id}").buildAndExpand(newObj.getId()).toUri();
	   return ResponseEntity.created(uri).build();
	}
	
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Contato> update(@PathVariable Integer id, @RequestBody Contato obj){
	Contato newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}


}
