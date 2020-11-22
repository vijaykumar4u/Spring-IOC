package com.vidvaan.dao;

import org.springframework.stereotype.Repository;

import com.vidvaan.bean.Employee;
@Repository
public class EmpDaoImpl implements EmployeeDao {

	public void save(Employee employee) {
		System.out.println("Employee Obj is called");
		System.out.println(employee.toString());

	}

}
