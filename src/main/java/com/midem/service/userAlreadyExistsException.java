package com.midem.service;

public class UserAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	UserAlreadyExistsException() {
		super("Usuário já existe com esse nome!");
	}
	
}
