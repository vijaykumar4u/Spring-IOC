package com.vidvaan.ionetwork;

public class JioNetwork implements Network {

	

		public static void sop(Object obj) {
		System.out.println(obj);
	}
	public void sms() {
		sop("this is Jio message");
		
	}
	public void calls() {
		sop("this is Jio calls");
		
	}
	public void data() {
		
		sop("this is Jio data");

	}

}
