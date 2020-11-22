package com.vidvaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vidvaan.bean.Employee;
import com.vidvaan.service.EmpServicImpl;

@Controller("controller")
public class EmployeeController {
@Autowired
public void setEmpService(EmpServicImpl empService) {
		this.empService = empService;
	}

	private EmpServicImpl empService;

	public void addEmployee(Employee employee) {
		System.out.println("controller");
		empService.save(employee);
	}

}
