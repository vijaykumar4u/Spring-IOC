package com.vidvaan.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MessageBean msg = (MessageBean) context.getBean("messbean");
		msg.display();
		context.registerShutdownHook();
		context.close();

	}

}
