package com.vidvaan.ionetwork;

public class Xoami {
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
