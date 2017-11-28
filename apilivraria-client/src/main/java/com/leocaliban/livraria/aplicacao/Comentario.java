package com.leocaliban.livraria.aplicacao;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Comentario {

	private Long idComentario;
	
	private String texto;

	private String usuario;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataComentario;

	private Livro livro;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Long getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getDataComentario() {
		return dataComentario;
	}

	public void setDataComentario(Date dataComentario) {
		this.dataComentario = dataComentario;
	}

}
