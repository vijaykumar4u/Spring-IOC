package com.vidvaan.ionetwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Samsung {
 
	private Network network;
	
	public void setNetwork(Network network) {
		this.network = network;
	}

	public void getNetwork() {
		network.calls();
		network.data();
		network.sms();
	}
	
}
