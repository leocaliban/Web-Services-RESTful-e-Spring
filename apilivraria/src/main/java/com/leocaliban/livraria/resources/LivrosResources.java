package com.leocaliban.livraria.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leocaliban.livraria.domain.Livro;
import com.leocaliban.livraria.repository.LivrosRepository;

@RestController
public class LivrosResources {
	@Autowired
	private LivrosRepository livroRepository;

	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		return livroRepository.findAll();
	}
}
