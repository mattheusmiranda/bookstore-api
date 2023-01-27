package com.br.bookstore2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookstore2.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
 