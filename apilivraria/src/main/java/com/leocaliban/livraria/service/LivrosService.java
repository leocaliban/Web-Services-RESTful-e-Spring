package com.leocaliban.livraria.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.leocaliban.livraria.domain.Comentario;
import com.leocaliban.livraria.domain.Livro;
import com.leocaliban.livraria.repository.ComentariosRepository;
import com.leocaliban.livraria.repository.LivrosRepository;
import com.leocaliban.livraria.service.exceptions.LivroNaoEncontradoException;

@Service
public class LivrosService {

	@Autowired
	private LivrosRepository livroRepository;
	@Autowired
	private ComentariosRepository comentarioRepository;
	
	public List<Livro> listar(){
		return livroRepository.findAll();
	}
	public Livro buscar(Long id) {
		Livro livro = livroRepository.findOne(id);
		if(livro == null) {
			throw new LivroNaoEncontradoException("Livro Não Encontrado.");
		}
		return livro;
	}
	
	public Livro salvar(Livro livro) {
		//setar para null garante que será criado uma instancia e não atualizar
		livro.setIdLivro(null);
		return livroRepository.save(livro);
	}
	
	public void deletar (Long id) {
		try {
		livroRepository.delete(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new LivroNaoEncontradoException("Livro Não Encontrado.");
		}
	}
	
	public void atualizar(Livro livro) {
		verificarExistencia(livro);
		livroRepository.save(livro);
	}
	
	private void verificarExistencia(Livro livro) {
		buscar(livro.getIdLivro());
	}
	
	
	public Comentario salvarComentario(Long idLivro, Comentario comentario) {
		Livro livro = buscar(idLivro);
		
		comentario.setLivro(livro);
		comentario.setDataComentario(new Date());
		
		return comentarioRepository.save(comentario);
		
	}
}
