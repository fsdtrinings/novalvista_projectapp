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
		
		return empRepository.getAllEmployeeBasedOnSalary(range1, range2);
	}

	@Override
	public Employee getEmployeeBasedOnId(int searchId) {
		
		return empRepository.getEmployeeBasedOnId(searchId);
	}

	@Override
	public Employee addNewEmployee(Employee e) {
		
		return empRepository.addNewEmployee(e);
	}

	@Override
	public Employee updateEmployeeSalary(Employee e) {
		
		return empRepository.updateEmployeeSalary(e.getEmpId(), e.getSalary());
	}

}
