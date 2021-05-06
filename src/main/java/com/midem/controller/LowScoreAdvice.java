package com.midem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.midem.service.LowScoreException;

@ControllerAdvice
public class LowScoreAdvice {

	@ResponseBody
	@ExceptionHandler(LowScoreException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	String LowScoreException(LowScoreException ex) {
		return ex.getMessage();
	}
	
}
