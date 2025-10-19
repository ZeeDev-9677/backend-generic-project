package com.school.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionalHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
		ErrorResponse ers = new ErrorResponse(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), "user not found",
				ex.getMessage());
		return new ResponseEntity<>(ers, HttpStatus.NOT_FOUND);
	}
}
