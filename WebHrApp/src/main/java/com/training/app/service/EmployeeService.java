package com.training.app.service;

import java.util.List;

import com.training.app.entity.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public List<Employee> getAllEmployeeBasedOnSalary(int range1,int range2);
	public Employee getEmployeeBasedOnId(int searchId);
	
	public Employee addNewEmployee(Employee e);
	public Employee updateEmployeeSalary(Employee e);
	
}
