package com.vidvaan.bean;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Student {
	private int sid;
	private String sname;
	private Address address;
	public void display() {
		System.out.println(sid+" "+sname+"\n"+address.getStreet()+" "+address.getCity());
		
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

	
	

}
