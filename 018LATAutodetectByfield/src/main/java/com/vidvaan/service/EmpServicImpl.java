package com.vidvaan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidvaan.bean.Employee;
import com.vidvaan.dao.EmpDaoImpl;
@Service
public class EmpServicImpl implements EmpService {
	@Autowired
	private EmpDaoImpl empdao;

	public void save(Employee employee) {
		System.out.println("employee Service");

		empdao.save(employee);
	}

}
