package com.vidvaan.ionetwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkTest {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	Xoami xoami= (Xoami) applicationContext.getBean("xoami");
	
	
	xoami.getNetwork();
	
}
}
