package com.srivastava.springapp;

public class C implements IB{
	private D d;
	
	private String message;
	C(){
		System.out.println("C Cons Call");
	}
	C(String msg){
		this.message = msg;
		System.out.println("Single Arg Cons Call of C");
	}
	C(String msg, D d){
		this();
		this.d = d;
		System.out.println("C Param Cons Call"+msg);
		this.message = msg;
	}
	
	public D getD() {
		return d;
	}
	public void setD(D d) {
		System.out.println("D Setter Call "+d);
		this.d = d;
	}
	C(int x){
		System.out.println("C int Param Cons Call "+x);
	}
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("C Setter Call "+msg);
		// TODO Auto-generated method stub
		this.message = msg;	
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
