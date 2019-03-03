package com.srivastava.springapp;

public class CompositeKey {
	private String name;
	private String phone;
	private String email;
	
	public int hashCode() {
		return name.length();
	}
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object instanceof CompositeKey) {
			CompositeKey key = (CompositeKey)object;
			if(this.name.equals(key.name) && this.phone.equals(key.phone) && this.email.equals(key.email)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "CompositeKey [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	public CompositeKey() {
		
	}
	public CompositeKey(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
