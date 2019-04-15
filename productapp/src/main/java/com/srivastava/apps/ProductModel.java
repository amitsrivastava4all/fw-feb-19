package com.srivastava.apps;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProductModel {
	//@NotNull(message="Id can't be blank")
	@NotNull
	
	//@Min(value=1,message="Id Can't Be less than 1 ")
	//@Max(value=10000, message="Id Can't Be More than 10000")
	private int id;
	//@NotBlank(message="Name Can't Be Blank")
	@NotBlank
	@Pattern(regexp="[A-Za-z]{3,10}")
	//@Pattern(regexp="[A-Za-z]{3,10}",message="Name Must be Alphabet between 3 to 10 chars")
	private String name;
	//@NotBlank(message="Desc can't be empty")
	//@Size(min=10,max=200,message="Min 10 and Max 200 Chars in Description")
	private String desc;
	//@NotNull(message="Price can't be blank")
	//@Min(value=100,message="Price Can't Be less than 100 ")
	//@Max(value=10000, message="Price Can't Be More than 10000")
	private double price;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}
	
}
