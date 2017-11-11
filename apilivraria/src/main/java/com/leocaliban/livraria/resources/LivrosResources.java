package com.leocaliban.livraria.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosResources {

	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public String listar() {
		return "Rest Aplication, Git Passo-A-Passo";
	}
}
