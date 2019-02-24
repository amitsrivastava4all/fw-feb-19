package com.srivastava.apps.springdemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("After Loading Spring xml file" );
		IProvider producer = (IProvider)ac.getBean("obj");
//		IProvider producer = (IProvider)ac.getBean("obj");
//		IProvider producer2 = (IProvider)ac.getBean("obj");
//		System.out.println("Same ref "+(producer==producer2));
//		
//		int result = producer.add(100, 200);
//		System.out.println("Result is "+result);
//		if(producer instanceof Provider) {
//			((Provider) producer).getB().show();
//		}
//		System.out.println("Before Provider Object Created......");
//		IProvider producer = (IProvider)ac.getBean("obj");
//		System.out.println("After Provider Object Created......");
//		if(producer instanceof Provider) {
//		Provider bb = (Provider) producer;
//		System.out.println("Enter the bean id ");
//		String beanId = new Scanner(System.in).next();
//		bb.createObject(beanId);
		
		//Customer ram = (Customer)ac.getBean("ram");
		//System.out.println(ram);
	//}
//		 int result = producer.add(100, 200);
//		 System.out.println("Result is "+result);
//		 if(ac instanceof ClassPathXmlApplicationContext) {
//			 ((ClassPathXmlApplicationContext)ac).close();
//		 }
		
	}

}
