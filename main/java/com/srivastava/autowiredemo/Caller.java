package com.srivastava.autowiredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		A a = (A)ac.getBean("obj");
		//a.getB().show();
		//a.getD().print();
		
		//a.getB2().show();
		

	}

}
