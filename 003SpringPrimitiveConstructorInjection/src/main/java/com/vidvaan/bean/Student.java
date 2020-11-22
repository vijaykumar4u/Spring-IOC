package com.vidvaan.bean;

public class Student {
	private int sid;
	private String sname;
	public Student(int sid, String sname) {
		
		this.sid = sid;
		this.sname = sname;
	}
	public void display() {
		System.out.println(sid+" "+sname);
		
	}
	
	

}
