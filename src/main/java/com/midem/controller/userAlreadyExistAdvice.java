package com.midem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.midem.service.userAlreadyExistsException;

@ControllerAdvice
public class userAlreadyExistAdvice {

	@ResponseBody
	@ExceptionHandler(userAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	String userAlreadyExists(userAlreadyExistsException ex) {
		return ex.getMessage();
	}
	
}
