package com.training.db;

import java.util.List;

import com.training.app.entity.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	MyDatabase db;
	
	public EmployeeRepositoryImpl() {
		db = new MyDatabase();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// write code to get all data from DB 
		// call/execute select * from Employees; 
		
		List<Employee> allEmployees = db.allEmployees;
		
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
	public Employee updateEmployeeSalary(int searchEmpId, int newSalary) {
		// TODO Auto-generated method stub
		return null;
	}

}
