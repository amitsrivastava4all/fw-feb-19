package com.srivastava.springapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class E implements ApplicationContextAware, BeanNameAware {
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	E(){
		System.out.println("E Cons Call");
	}
	public void start() {
		System.out.println("E Start");
	}
	public void stop() {
		System.out.println("E1 Stop");
	}
	public void call(String beanName) {
		IB b = (IB)this.ac.getBean(beanName);
		int result = b.add(100, 2);
		System.out.println("Result is "+result);
		System.out.println("Message is "+message);
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
		// TODO Auto-generated method stub
			this.beanName = name;
			
	}
}
