package com.vidvaan.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.bean.Employee;
import com.vidvaan.controller.EmployeeController;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController controller = (EmployeeController) context.getBean("controller");
		controller.addEmployee(new Employee(120, "vijay"));
	}

}
