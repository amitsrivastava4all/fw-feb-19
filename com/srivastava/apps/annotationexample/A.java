package com.srivastava.apps.annotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
@Controller
//@Service
//@Component
public class A {
	private String name;
	//@Autowired
	//@Qualifier("two")
	private IB x;
	public A() {
		System.out.println("A Cons Call");
	}
	
	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//	@Autowired
//	
//	public A(IB b) {
//		this.x = b;
//		System.out.println("B is "+b);
//		System.out.println("A Cons Injection");
//	}
	public IB getX() {
		return x;
	}
	@Autowired
	public void setX(IB x) {
		System.out.println("Setter Injection");
		this.x = x;
	}

	
	
}
