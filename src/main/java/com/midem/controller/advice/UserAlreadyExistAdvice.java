package com.midem.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.midem.service.UserAlreadyExistsException;

@ControllerAdvice
public class UserAlreadyExistAdvice {

	@ResponseBody
	@ExceptionHandler(UserAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	String userAlreadyExists(UserAlreadyExistsException ex) {
		return ex.getMessage();
	}
	
}
