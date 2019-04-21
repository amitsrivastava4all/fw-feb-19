package com.srivastava.apps.ormdemos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD {
	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); ;
	
	public void add(int id , String name, double salary) {
		Employee emp = new Employee(id, name,salary);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		System.out.println("Data Store in DB");
	}
	public static void main(String[] args) {
		CRUD crud = new CRUD();
		crud.add(1001, "Ram", 9999);
	}

}
