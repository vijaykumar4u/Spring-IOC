package com.vidvaan.beanlifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean,DisposableBean,BeanNameAware{
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

	public void startMessageBean() {
		System.out.println("Bean started");

	}

	public void endMessageBean() {
		System.out.println("Bean destroyed");

	}

	public void destroy() throws Exception {
		System.out.println("Bean destroyMethod");

		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Init Method");

		
	}

	public void setBeanName(String name) {
		System.out.println("What is the Ben name");
		
	}
}
