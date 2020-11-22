package com.vidvaan.empbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfigCls {
	@Bean
	public Employee getBean() {
		Employee employee = new Employee();
		
		return employee;
	}
	@Bean
	public Department getDepartment() {
		Department department = new Department();
		department.setDepName("IT");
		return department;
	}
	

}
