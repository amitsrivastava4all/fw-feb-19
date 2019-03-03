package com.srivastava.springapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Emp {
	private ArrayList<Dept> dept;
	private HashMap<CompositeKey, Dept> deptMap;
	private int id;
	//private HashSet<Dept> deptSet;
	//private TreeSet<Dept> deptSet2
	private String name;
	

	public HashMap<CompositeKey, Dept> getDeptMap() {
		return deptMap;
	}

	public void setDeptMap(HashMap<CompositeKey, Dept> deptMap) {
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
