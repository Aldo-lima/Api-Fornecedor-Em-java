package com.api.produtos.controller.excepitions;

import javax.servlet.ServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.produtos.service.excepitions.ObjectNotFoudException;

@ControllerAdvice
public class ResourceExeptionHandler {

	@ExceptionHandler(ObjectNotFoudException.class)
	public ResponseEntity<StanderError> objectNotFoudException(ObjectNotFoudException e, ServletRequest request) {
		StanderError error = new StanderError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
				e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
