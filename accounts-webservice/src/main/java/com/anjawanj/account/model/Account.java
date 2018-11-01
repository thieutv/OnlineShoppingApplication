package com.anjawanj.account.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class Account {

	@Id
	private BigInteger id;
	private String firstName;
	private String lastName;
	private String emailID;
	private Integer age;
	private Address address;
	private String mobileNo;	
	
	
	
	public Account(String firstName, String lastName, String emailID, Integer age, Address address, String mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.age = age;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailID=" + emailID
				+ ", age=" + age + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}

	
}