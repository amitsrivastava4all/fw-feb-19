package com.srivastava.apps.ormdemos;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD {
	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); ;
	
	public void update(int id) {
		Session session = sessionFactory.openSession();
		Employee emp = session.get(Employee.class, id);
		System.out.println("Old Salary is "+emp.getSalary());
		emp.setSalary(emp.getSalary()+ 2000);
		System.out.println("New Salary is "+emp.getSalary());
		Transaction tr = session.beginTransaction();
		session.update(emp);
		tr.commit();
		session.close();
		System.out.println("Record Updated...");
	}
	public Employee findById(int id){
		Employee employee = null;
		Session session = sessionFactory.openSession();
		employee = (Employee)session.get(Employee.class, id);  // get pick 
							//session.load(Employee.class, id)
		System.out.println("Query Not Run...");
		System.out.println(employee.getName());
		session.close();
		return employee;
	}

	public void update2(int id) {
		Session session = sessionFactory.openSession();
		Employee emp = session.get(Employee.class, id);
		// emp version id number
		System.out.println("Emp Record is "+emp);
		
		session.close();
		session = null;
		System.out.println("Session Close");
		System.out.println("Now Enter the New Details");
		
		
		
		Session session2 = sessionFactory.openSession();
		Employee emp2 = session2.get(Employee.class, id); 
		 // version id another
		Transaction tr = session2.beginTransaction();
		emp.setSalary(776655);
		session2.merge(emp);
		//session2.update(emp);
		tr.commit();
		session2.close();
		System.out.println("Record Updated...");
	}
	
	public void saveExample( String name, double salary) {
		Employee emp = new Employee( name,salary);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable id1 = session.save(emp);
		//emp.setSalary(99999);
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
		 //session.evict(emp);
		 //session.persist(emp);
		
		
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
	
	public void add(String name, double salary) {
		Employee emp = new Employee( name,salary);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//session.save(emp);
		//Serializable id1 = session.save(emp); // insert query
		//System.out.println("Id "+id1);
		session.saveOrUpdate(emp);
		//session.save
		//emp.setSalary(8877777); //  update query
		tx.commit();
		session.close();
		emp.setSalary(88888); // Deattach
		System.out.println("Data Store in DB");
	}
	public void search(int id ) {
		Employee emp = new Employee();
		emp.setId(id);
		Session session = sessionFactory.openSession();
		//Employee empObject = session.get(Employee.class, id);
		//System.out.println("Searching in DB");
		Employee empObject = session.load(Employee.class, id);
		System.out.println("After Load ");
		if(empObject!=null) {
			//empObject.setSalary(empObject.getSalary()+100000);
			System.out.println("Record found...");
			System.out.println("Print EMp "+empObject);
			
		}
		else {
			System.out.println("Record not found");
		}
		session.close();
		System.out.println("Data Store in DB");
	}
	public static void main(String[] args) {
		CRUD crud = new CRUD();
		crud.update2(9);
		//crud.saveExample("Ram", 9999);
		//crud.persistExample1( "bbbb",234);
		
//		crud.add( "Tim", 29999);
//		
//		System.out.println("Enter the emp no to search");
//		int id= new Scanner(System.in).nextInt();	
//		crud.search(id);
		
	}

}
