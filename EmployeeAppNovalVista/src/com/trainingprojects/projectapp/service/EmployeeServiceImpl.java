package com.trainingprojects.projectapp.service;

import com.trainingprojects.projectapp.dao.EmployeeDAOImpl;
import com.trainingprojects.projectapp.dao.IEmployeeDAO;
import com.trainingprojects.projectapp.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService{

	IEmployeeDAO empDAO;
	
	
	
	public EmployeeServiceImpl() {
		empDAO = new EmployeeDAOImpl();
	}

	@Override
	public Employee addNewEmployee(Employee e) {
		 return empDAO.addNewEmployee(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		
		return empDAO.updateEmployee(e);
	}

	
}
