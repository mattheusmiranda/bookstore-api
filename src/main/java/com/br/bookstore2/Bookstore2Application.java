package com.br.bookstore2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.bookstore2.domain.Categoria;
import com.br.bookstore2.domain.Livro;
import com.br.bookstore2.repositories.CategoriaRepository;
import com.br.bookstore2.repositories.LivroRepository;

@SpringBootApplication
public class Bookstore2Application implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Bookstore2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(0, "Informatica", "Livro de TI");
		Livro l1 = new Livro(0, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
	
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1));
		livroRepository.saveAll(Arrays.asList(l1));
		
	}

}
