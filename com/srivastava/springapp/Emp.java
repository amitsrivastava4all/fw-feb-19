package com.srivastava.springapp;

import java.util.ArrayList;
import java.util.Map;

public class Emp {
	private ArrayList<Dept> dept;
	private Map<String, Dept> deptMap;
	private int id;
	private String name;
	

	public Map<String, Dept> getDeptMap() {
		return deptMap;
	}

	public void setDeptMap(Map<String, Dept> deptMap) {
		this.deptMap = deptMap;
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

	public ArrayList<Dept> getDept() {
		return dept;
	}

	public void setDept(ArrayList<Dept> dept) {
		this.dept = dept;
	}
	

	@Override
	public String toString() {
		return "Emp [dept=" + dept + ", id=" + id + ", name=" + name +" Map "+deptMap+ "] ";
	}
	
	
	
}
