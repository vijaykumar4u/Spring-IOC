package com.vidvaan.ionetwork;

public class AirtelNetwork implements Network {


	public static void sop(Object obj) {
	System.out.println(obj);
}
public void sms() {
	sop("this is airtel message");
	
}
public void calls() {
	sop("this is airtel calls");
	
}
public void data() {
	
	sop("this is airtel data");

}


}
