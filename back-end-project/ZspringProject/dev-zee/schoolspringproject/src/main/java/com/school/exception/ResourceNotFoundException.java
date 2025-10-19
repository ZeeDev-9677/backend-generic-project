package com.school.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
//	public ResponseEntity<String> getResourceNotFoundException(Exception ex) {
//		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//	}

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
