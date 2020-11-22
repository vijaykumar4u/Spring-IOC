package com.vidvaan.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean  {
	private String message;

	public MessageBean() {
		System.out.println("default bean");
	}

	public MessageBean(String message) {
		System.out.println("Parameter bean");

		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void display() {
		System.out.println("Message Bean:" + message);
	}

	public void messagebean() {
		System.out.println("start");

	}

	public void destro() {
		System.out.println("End");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean init Method");

	}

	public void destroy() throws Exception {
		System.out.println("Bean destroyMethod");

	}
}
