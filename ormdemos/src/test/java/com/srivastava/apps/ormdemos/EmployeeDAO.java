package com.srivastava.apps.ormdemos;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
     


	public void add(int id, String name, double salary, Date joiningDate)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		ITEmployee ram = new ITEmployee();
		Address ck = new Address();
		ck.setCity("delhi");
		ck.setState("dl");
		ck.setZipCode("110007");
		ram.setCk(ck);
		//ram.setId(id);
		ram.setName(name);
		ram.setSalary(salary);
		
		ram.setJoiningDate(joiningDate);
		Address address = new Address();
		address.setCity("Noida");
		address.setState("UP");
		address.setZipCode("2222");
		
		Address resAddress = new Address();
		resAddress.setCity("Delhi");
		resAddress.setState("Delhi");
		resAddress.setZipCode("11111");
		
		ArrayList<Address> addressList = new ArrayList<>();
		addressList.add(address);
		addressList.add(resAddress);
		//ram.setAddressList(addressList);
		session.save(ram);
		transaction.commit();
		session.close();

	}
	
}
