package com.leocaliban.livraria.resources;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leocaliban.livraria.domain.Livro;

@RestController
public class LivrosResources {

	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		Livro l1 = new Livro("Rest Aplication");
		Livro l2 = new Livro("Git Passo-A-Passo");
		Livro[] livros = {l1,l2};
		return Arrays.asList(livros);
	}
}
