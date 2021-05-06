package com.midem.service;

public class LowScoreException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	LowScoreException(Integer score) {
		super("Para superar seu record, você precisa alcançar uma pontuação superior a " + score + "!");
	}
	
}
