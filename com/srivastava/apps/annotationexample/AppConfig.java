package com.srivastava.apps.annotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.srivastava"})
public class AppConfig {

	// <bean id='complex' class='DB'>
	@Autowired
	@Qualifier("mydb")
	DB db;
	@Bean(name="complex")
	public DB getDBData() {
		//DB db = new DB();
		db.setDbName("shop");
		db.setDriverName("mysql");
		//db.setCombo(new Combo());
		return db;
		
		
	}
}
