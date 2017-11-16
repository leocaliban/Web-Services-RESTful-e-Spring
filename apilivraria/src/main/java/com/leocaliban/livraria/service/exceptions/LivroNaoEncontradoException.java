package com.leocaliban.livraria.service.exceptions;

public class LivroNaoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 39223152318951783L;
	
	public LivroNaoEncontradoException (String mensagem) {
		super(mensagem);
	}
	public LivroNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
