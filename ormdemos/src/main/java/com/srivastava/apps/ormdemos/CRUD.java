package com.srivastava.apps.ormdemos;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD {
	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); ;
	
	public void saveExample( String name, double salary) {
		Employee emp = new Employee( name,salary);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable id1 = session.save(emp);
		session.evict(emp);
		Serializable id2 = session.save(emp);
		System.out.println("Id1 "+id1 +" Id2 "+id2);
		//session.flush();
		
		tx.commit();
		
		session.close();
		System.out.println("Save Record ");
	}
	
	public void persistExample1( String name, double salary) {
		Employee emp = new Employee( name,salary);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		 session.persist(emp);
		 session.evict(emp);
		 session.persist(emp);
		
		
		//session.flush();
		
		tx.commit();
		
		session.close();
		System.out.println("Persist Record ");
	}
	
	public void persistExample(int id, String name, double salary ) {
		Employee emp = new Employee( name,salary);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//session.save(emp);
		session.persist(emp);
		session.evict(emp);
		//session.saveOrUpdate(emp);
		//emp.setSalary(8877777);
		//session.save(emp);
		emp.setId(emp.getId()+1);
		session.persist(emp);
		System.out.println("Saved Done");
		tx.commit();
		emp.setSalary(1900);
		//Serializable id1 = session.save(emp);
		System.out.println("Persist Call");
			
		//System.out.println("Id "+id1);
		
		session.close();
		
		
		
		System.out.println("Data Store in DB");
		
	}
	
	public void add(int id , String name, double salary) {
		Employee emp = new Employee( name,salary);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//session.save(emp);
		Serializable id1 = session.save(emp);
		System.out.println("Id "+id1);
		//session.saveOrUpdate(emp);
		//emp.setSalary(8877777);
		tx.commit();
		session.close();
		System.out.println("Data Store in DB");
	}
	public void search(int id ) {
		Employee emp = new Employee();
		emp.setId(id);
		Session session = sessionFactory.openSession();
		Employee empObject = session.get(Employee.class, id);
		//Employee empObject = session.load(Employee.class, id);
		System.out.println("After Load ");
		if(empObject!=null) {
			empObject.setSalary(empObject.getSalary()+100000);
			System.out.println("Record found...");
			System.out.println(empObject);
			
		}
		else {
			System.out.println("Record not found");
		}
		session.close();
		System.out.println("Data Store in DB");
	}
	public static void main(String[] args) {
		CRUD crud = new CRUD();
		
		crud.saveExample("Ram", 9999);
		//crud.persistExample1( "bbbb",234);
		
		//crud.add(1003, "Tim", 29999);
//		System.out.println("Enter the emp no to search");
//		int id= new Scanner(System.in).nextInt();	
//		crud.search(id);
		
	}

}
