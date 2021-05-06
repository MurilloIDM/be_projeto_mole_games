package com.midem.service;

public class userAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	userAlreadyExistsException() {
		super("Usuário já existe com esse nome!");
	}
	
}
