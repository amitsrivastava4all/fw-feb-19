package com.srivastava.apps.annotationexample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// <bean>
@Component("one")

@Primary
public class B implements IB {
	public B() {
		System.out.println("B Cons Call");
	}
	public void show() {
		System.out.println("B Show");
	}
}
