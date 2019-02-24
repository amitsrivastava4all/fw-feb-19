package com.srivastava.apps.springdemo;

public class Provider2 implements IProvider {
	public Provider2() {
		System.out.println("Provider 2 cons call");
	
	}
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

}
