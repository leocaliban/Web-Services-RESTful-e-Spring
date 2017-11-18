package com.leocaliban.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leocaliban.livraria.domain.Autor;
import com.leocaliban.livraria.repository.AutoresRepository;
import com.leocaliban.livraria.service.exceptions.AutorExistenteException;
import com.leocaliban.livraria.service.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {
	
	@Autowired
	private AutoresRepository autoresRepository;

	public List<Autor> listar(){
		return autoresRepository.findAll();
	}
	
	public Autor salvar(Autor autor) {
		//se o autor recebido não for nulo 
		if(autor.getIdAutor() != null) {
			//buscamos o autor no banco de dados
			Autor autorSalvo = autoresRepository.findOne(autor.getIdAutor());
			//se o autorSalvo for nulo é porque ele não existe, caso exista então ele não poderá ser salvo
			if (autorSalvo != null) {
				throw new AutorExistenteException("O Autor Já Existe.");
			}
		}
		return autoresRepository.save(autor);
	}
	
	
	public Autor buscar(Long id) {
		Autor autor = autoresRepository.findOne(id);
		if(autor==null) {
			throw new AutorNaoEncontradoException("Autor Não Encontrado");
		}
		return autor;
	}
	
	
}
