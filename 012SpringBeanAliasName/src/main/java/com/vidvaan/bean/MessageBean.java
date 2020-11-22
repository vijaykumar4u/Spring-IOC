package com.vidvaan.bean;

public class MessageBean {
	private String message;

	public MessageBean() {
		System.out.println("MessageBean()");
	}

	public MessageBean(String message) {
		System.out.println("MessageBean(String message)");
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("MessageBean.setMessage(String message)");
		this.message = message;
	}

	public void displayInjectedValue() {
		System.out.println("Message ::" + getMessage());
	}

}