package com.srivastava.autowiredemo;

public class A {
	private B b;
	private D d;
	private E e;
	public A() {
		
	}
	
	
	public D getD() {
		return d;
	}


	public void setD(D d) {
		this.d = d;
	}

	public A(B b) {
		this.b = b;
		System.out.println("1 Injection");
	}
	
	public A(D d, E e) {
		System.out.println("2.... Injection");
		//this.b = b;
		this.d = d;
		this.e =  e;
	}
	public A(B b , D d) {
		System.out.println("2 Injection");
		this.b = b;
		this.d = d;
	}
//	public A(B b , D d, E e) {
//		System.out.println("3 Injection");
//		this.b = b;
//		this.d = d;
//		this.e =  e;
//	}
	
	
//	private B b2;
//	
//
//	public B getB2() {
//		return b2;
//	}
//
//	public void setB2(B b2) {
//		this.b2 = b2;
//	}

	public E getE() {
		return e;
	}


	public void setE(E e) {
		this.e = e;
	}


	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	

}
