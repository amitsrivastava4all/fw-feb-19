package com.srivastava.apps.springdemo;

public class B implements IB{

	public B() {
		System.out.println("B Cons Call");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inside B Show");
	}

}
