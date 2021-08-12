package com.api.produtos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.produtos.models.Fornecedor;



public interface FornecedorRepository extends  JpaRepository<Fornecedor, Integer>{
    
}
