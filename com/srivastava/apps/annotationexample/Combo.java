package com.srivastava.apps.annotationexample;

import org.springframework.stereotype.Component;

@Component
public class Combo {
	private String name;
	private String value;
	private void loadDataFromDB() {
		name = "City";
		value= "Delhi";
		
	}
	Combo(){
		this.loadDataFromDB();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
