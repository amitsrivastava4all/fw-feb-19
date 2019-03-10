package com.srivastava.apps.annotationexample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mydb")
public class DB {
	private String driverName;
	private String dbName;
	@Autowired
	private Combo combo ;
	
	@PostConstruct
	public void start()
	{
		System.out.println("DB Start Call");
	}
	@PreDestroy
	public void end() {
		
	}
	public DB() {
		System.out.println("DB Call");
	}
	
	public Combo getCombo() {
		return combo;
	}
	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
	
}
