package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
	// Add an Exception handler using @ExceptionHandler
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
			// create StudentErrorResponse
			StudentErrorResponse error=new StudentErrorResponse();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setTimeStamp(System.currentTimeMillis());
			error.setMessage(exc.getMessage());
			// return ResponseEntity
			
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
			
		}
		
		// Add another Exception handler to catch any exception(catch all)
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleException(Exception exc){
			StudentErrorResponse error=new StudentErrorResponse();
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setTimeStamp(System.currentTimeMillis());
			error.setMessage(exc.getMessage());
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

		}
}
