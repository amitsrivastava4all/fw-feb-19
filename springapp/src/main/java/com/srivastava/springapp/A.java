package com.srivastava.springapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		E obj = (E)context.getBean("e2");
		context.close();
		
		//		System.out.println("************************************************");
//		IB b = (IB) context.getBean("obj") ;
//		IB b2 = (IB) context.getBean("obj") ;
//		System.out.println(b==b2?"Same Ref":"Not Same Ref");
//		int result = b.add(100, 200);
//		System.out.println(result);
//		//b.setMessage("Hello ");
//		System.out.println(b.getMessage());
//		System.out.println("Enter the Message to Set");
//		String message = new Scanner(System.in).nextLine();
//		b.setMessage(message);
//		System.out.println("Now New Message is "+b.getMessage());
	}

}
