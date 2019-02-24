package com.srivastava.apps.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Provider implements IProvider, ApplicationContextAware,BeanNameAware {
	private B b ;
	private D d;
	
	
	public D getD() {
		return d;
	}
	public void setD(D d) {
		System.out.println("D Setter Call");
		this.d = d;
	}
	public Provider() {
		System.out.println("Provider Cons Call");
	}
	public void start() {
		System.out.println(beanName+" Start Call");
	}
	public void stop() {
		System.out.println(beanName+" End Call");
	}

	public B getB() {
		return b;
	}


	public void setB(B b) {
		System.out.println("Provider B Setter Call");
		this.b = b;
	}


	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}
	public void createObject(String beanName) {
			ac.getBean(beanName);
	}
	private ApplicationContext ac;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Set App Context Call");
		this.ac = applicationContext;
		
	}
	private String beanName;
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		// TODO Auto-generated method stub
		
	}

}
