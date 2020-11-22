package com.vidvaan.controller;

import com.vidvaan.bean.Employee;
import com.vidvaan.service.EmpServicImpl;

public class EmployeeController {
	private EmpServicImpl empService;

	public void setEmpService(EmpServicImpl empService) {
		this.empService = empService;
	}
	public void addEmployee(Employee employee) {
		System.out.println("controller");
		empService.save(employee);
	}

}
