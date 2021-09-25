package com.api.produtos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.produtos.models.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
