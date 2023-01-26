package com.br.bookstore2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookstore2.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
