package com.leocaliban.livraria.domain;

import java.util.Date;
import java.util.List;

public class Livro {
	private Long idLivro;
	private String nome;
	private Date dataPublicacao;
	private String editora;
	private String resumo;
	private List<Comentario> comentarios;
	private String autor;
	
	public Livro() {}
	
	public Livro (String nome) {
		this.nome = nome;
	}
	public Long getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

}
