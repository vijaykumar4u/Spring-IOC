package com.vidvaan.empbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringBeanConfigCls.class);
		Employee employee=context.getBean(Employee.class);
		System.out.println(employee);

	}

}
