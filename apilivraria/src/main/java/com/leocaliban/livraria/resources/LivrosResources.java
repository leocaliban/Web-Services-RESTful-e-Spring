package com.leocaliban.livraria.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leocaliban.livraria.domain.Livro;
import com.leocaliban.livraria.repository.LivrosRepository;

@RestController
@RequestMapping("/livros")
public class LivrosResources {
	@Autowired
	private LivrosRepository livroRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Livro> listar() {
		return livroRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {
		livroRepository.save(livro);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Livro buscar(@PathVariable("id") Long id) {
		return livroRepository.findOne(id);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public void remover(@PathVariable("id") Long id) {
		livroRepository.delete(id);
	}
}
