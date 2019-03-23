package com.srivastava.apps.aopdemo;

import org.springframework.stereotype.Component;

@Component("per")
public class Person {
	public void printing() {
		System.out.println("Person Print");
	}
}
