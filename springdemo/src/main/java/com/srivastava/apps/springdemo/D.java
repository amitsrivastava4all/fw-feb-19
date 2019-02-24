package com.srivastava.apps.springdemo;

public class D {
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("D Setter Called "+message);
		this.message = message;
	}

	public D() {
		System.out.println("D Cons Call");
	}

}
