package com.vidvaan.bean;

public class Student {
	private int sid;
	private String sname;
	public void display() {
		System.out.println(sid+" "+sname);
		
	}
	
	

	public void setSid(int sid) {
		System.out.println("id setter");
		this.sid = sid;
	}

	public void setSname(String sname) {
		System.out.println("name setter");

		this.sname = sname;
	}
	
	

}
