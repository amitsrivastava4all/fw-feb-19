package com.srivastava.springapp;

public class B implements IB{
	private String message;
	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		this.message  = msg;
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
