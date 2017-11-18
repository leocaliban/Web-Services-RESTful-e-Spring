package com.leocaliban.livraria.service.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 39223152318951783L;
	
	public AutorNaoEncontradoException (String mensagem) {
		super(mensagem);
	}
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
