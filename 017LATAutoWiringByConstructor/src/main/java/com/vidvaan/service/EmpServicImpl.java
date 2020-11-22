package com.vidvaan.service;

import com.vidvaan.bean.Employee;
import com.vidvaan.dao.EmpDaoImpl;

public class EmpServicImpl implements EmpService {
	private EmpDaoImpl empdao;
	

	
	


	public EmpServicImpl(EmpDaoImpl empdao) {
		
		this.empdao = empdao;
	}






	public void save(Employee employee) {
		System.out.println("employee Service");
		
		empdao.save(employee);
	}

}
