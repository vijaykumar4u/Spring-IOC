package com.vidvaan.bean;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Student {
	private int sid;
	private String sname;
	private Address address;
	
	
	public Student(int sid, String sname, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}


	public void display() {
		System.out.println(sid+" "+sname+"\n"+address.getStreet()+" "+address.getCity());
		
	}
	
	
	

	
	

}
