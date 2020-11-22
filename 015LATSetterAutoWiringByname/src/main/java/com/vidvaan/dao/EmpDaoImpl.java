package com.vidvaan.dao;

import com.vidvaan.bean.Employee;

public class EmpDaoImpl implements EmployeeDao {

	public void save(Employee employee) {
		System.out.println("Employee Obj is called");
		System.out.println(employee.toString());

	}

}
