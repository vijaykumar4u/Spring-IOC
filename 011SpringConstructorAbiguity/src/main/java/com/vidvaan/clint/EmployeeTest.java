package com.vidvaan.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.bean.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = (Employee) Context.getBean("employee");
		emp.displayInjectedValues();
	}
	

}
