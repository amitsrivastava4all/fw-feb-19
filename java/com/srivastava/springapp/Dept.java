package com.srivastava.springapp;

public class Dept {
	private int id;
	private String name;
	public Dept() {
		
	}
	
//	public boolean equals(Object object) {
//		
//	}
//	public int hashCode() {
//		return name.length();
//	}
	
	


	public Dept(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}
	

}
