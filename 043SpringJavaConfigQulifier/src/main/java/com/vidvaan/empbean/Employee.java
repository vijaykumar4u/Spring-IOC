package com.vidvaan.empbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value(value = "100") // 2 nd way to pass values
	private int id;
	@Value(value = "Vijay")

	private String name;
	@Autowired
	private Department department;//injecting another bean 
	

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

//	@Required//1 st way
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

//	@Required
	public void setName(String name) {
		this.name = name;
	}

	
}
