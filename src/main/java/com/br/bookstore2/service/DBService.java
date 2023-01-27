package com.br.bookstore2.service;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookstore2.domain.Categoria;
import com.br.bookstore2.domain.Livro;
import com.br.bookstore2.repositories.CategoriaRepository;
import com.br.bookstore2.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	@Transactional
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(0, "Informatica", "Livro de TI");
		Categoria cat2 = new Categoria(0, "Ficção Cientifica", "Livro de Ficção Cientifica");
		Categoria cat3 = new Categoria(0, "Biografias", "Livro de Biografias");

		Livro l1 = new Livro(0, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(0, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsum", cat1);
		Livro l3 = new Livro(0, "The Time Machine", "H.G. Wells", "Lorem ipsum", cat2);
		Livro l4 = new Livro(0, "The War of the Worlds", "H.G. Wells", "Lorem ipsum", cat2);
		Livro l5 = new Livro(0, "I, Robot", "Isaac Asimov", "Lorem ipsum", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));   
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
		System.out.println("ACABOU");
	}
}