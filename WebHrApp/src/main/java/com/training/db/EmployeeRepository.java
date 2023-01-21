package com.training.db;

import java.util.List;

import com.training.app.entity.Employee;

public interface EmployeeRepository {

	public List<Employee> getAllEmployee();
	public List<Employee> getAllEmployeeBasedOnSalary(int range1,int range2);
	public Employee getEmployeeBasedOnId(int searchId);
	
	public Employee addNewEmployee(Employee e);
	public Employee updateEmployeeSalary(int searchEmpId,int newSalary);
	
	
	
	
}
