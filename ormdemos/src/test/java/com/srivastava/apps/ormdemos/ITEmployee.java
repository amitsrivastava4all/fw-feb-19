package com.srivastava.apps.ormdemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="itemp_ck")
public class ITEmployee {
	//@Id
	//private int id;
	@Column(name="empname" , nullable=false)
	private String name;
	private double salary;
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	@EmbeddedId
	private Address ck;
	
	//@ElementCollection
	//private Collection<Address> addressList;
	
	
public Address getCk() {
		return ck;
	}
	public void setCk(Address ck) {
		this.ck = ck;
	}
	//	public Collection<Address> getAddressList() {
//		return addressList;
//	}
//	public void setAddressList(ArrayList<Address> addressList) {
//		this.addressList = addressList;
//	}
	//@EmbeddedId
//	@Embedded
//	@AttributeOverrides( {
//        @AttributeOverride(name="city", column = @Column(name="office_city") ),
//        @AttributeOverride(name="state", column = @Column(name="office_state") ),
//        @AttributeOverride(name="zipCode", column = @Column(name="office_zipCode") )
//	} )	
//	//@Embedded
//	private Address officeAddress;
//	@Embedded
//	private Address resAddress;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
//	public Address getOfficeAddress() {
//		return officeAddress;
//	}
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}
//	
//	public Address getResAddress() {
//		return resAddress;
//	}
//	public void setResAddress(Address resAddress) {
//		this.resAddress = resAddress;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
//				+ ", joiningDate=" + joiningDate +
//				"]";
//	}

	
	

}
