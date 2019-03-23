package com.srivastava.apps.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		MyDAO dao  = (MyDAO)ac.getBean("myDAO");
		//dao.print();
		//Person person = (Person)ac.getBean("per");
		//emp.print();
		//person.printing();
	}
}
