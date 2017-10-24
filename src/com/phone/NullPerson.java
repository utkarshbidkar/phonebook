package com.phone;

public class NullPerson implements AbstractPerson {

	@Override
	public String getSid() {
		return "-1";
	}

	@Override
	public boolean isNull() {
		return true;
	}
	
	@Override
	public String toString() {
		return "No such person found.";
	}

}
