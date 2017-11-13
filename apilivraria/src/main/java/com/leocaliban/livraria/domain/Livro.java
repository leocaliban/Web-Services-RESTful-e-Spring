package com.leocaliban.livraria.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Livro {
	@JsonInclude(Include.NON_NULL)
	private Long idLivro;
	@JsonInclude(Include.NON_NULL)
	private String nome;
	@JsonInclude(Include.NON_NULL)
	private Date dataPublicacao;
	@JsonInclude(Include.NON_NULL)
	private String editora;
	@JsonInclude(Include.NON_NULL)
	private String resumo;
	@JsonInclude(Include.NON_NULL)
	private List<Comentario> comentarios;
	@JsonInclude(Include.NON_NULL)
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
