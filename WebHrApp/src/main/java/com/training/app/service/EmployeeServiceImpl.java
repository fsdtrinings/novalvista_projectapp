package com.training.app.service;

import java.util.List;

import com.training.app.entity.Employee;
import com.training.db.EmployeeRepository;
import com.training.db.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository empRepository;
	
	public EmployeeServiceImpl() {
		empRepository = new EmployeeRepositoryImpl();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// code to validate user 
		// code to verify user 
		
		List<Employee> allEmployees = empRepository.getAllEmployee();
		return allEmployees;
	}

	@Override
	public List<Employee> getAllEmployeeBasedOnSalary(int range1, int range2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeBasedOnId(int searchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addNewEmployee(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

}
