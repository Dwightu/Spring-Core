package com.luv2code.springdemo.rest;

public class CustomerErrorResponse {

	private int status;
	private String message;
	private long tempStamp;
	
	public CustomerErrorResponse() {
		
	}

	public CustomerErrorResponse(int status, String message, long tempStamp) {
		this.status = status;
		this.message = message;
		this.tempStamp = tempStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTempStamp() {
		return tempStamp;
	}

	public void setTempStamp(long tempStamp) {
		this.tempStamp = tempStamp;
	}
	
	
	
}
