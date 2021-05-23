package com.springapi.employeemanager.service;

import com.springapi.employeemanager.repo.EmployeeRepo;

public class EmployeeService {
	
	private final EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
	
	

}
