package com.srivastava.apps.annotationexample;

import org.springframework.stereotype.Component;

@Component("two")
public class C implements IB{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("C Show");	
	}

}
