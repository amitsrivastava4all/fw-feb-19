package com.srivastava.apps.ormdemos;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD {
	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); ;
	
	
	

	
	public static void main(String[] args) {
		CRUD crud = new CRUD();
	
		
	}

}
