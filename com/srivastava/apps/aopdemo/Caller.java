package com.srivastava.apps.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Emp emp = (Emp)ac.getBean("emp");
		//Person person = (Person)ac.getBean("per");
		emp.print();
		//person.printing();
	}
}
