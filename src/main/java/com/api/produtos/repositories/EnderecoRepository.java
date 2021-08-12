package com.api.produtos.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.api.produtos.models.Enderecof;



public interface EnderecoRepository extends JpaRepository<Enderecof, Integer>{
	
}
