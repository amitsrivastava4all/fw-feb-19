package com.srivastava.apps.annotationexample;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(AppConfig.class);
    	DB db = (DB)ac2.getBean("complex");
    	System.out.println(db.getDbName());
    	System.out.println(db.getDriverName());
    	System.out.println(db.getCombo().getName());
    	System.out.println(db.getCombo().getValue());
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        A obj = (A)ac.getBean("a");
        obj.getX().show();
        System.out.println("Enter the Name");
        obj.setName(new Scanner(System.in).next());
        System.out.println("Name is "+obj.getName());
    	//System.out.println( "Hello World!" );
    }
}
