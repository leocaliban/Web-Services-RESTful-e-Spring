package com.leocaliban.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leocaliban.livraria.domain.Autor;
import com.leocaliban.livraria.repository.AutoresRepository;

@Service
public class AutoresService {
	
	@Autowired
	private AutoresRepository autoresRepository;

	public List<Autor> listar(){
		return autoresRepository.findAll();
	}
}
