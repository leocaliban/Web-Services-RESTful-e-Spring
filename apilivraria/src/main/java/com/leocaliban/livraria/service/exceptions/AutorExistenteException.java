package com.leocaliban.livraria.service.exceptions;

public class AutorExistenteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 39223152318951783L;
	
	public AutorExistenteException (String mensagem) {
		super(mensagem);
	}
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
