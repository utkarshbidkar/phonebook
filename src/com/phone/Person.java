package com.phone;

public class Person implements AbstractPerson{

	String name;
	String sid;
	String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sid=" + sid + ", phoneNumber=" + phoneNumber + "]";
	}
	@Override
	public boolean isNull() {
		return false;
	}
	
}
