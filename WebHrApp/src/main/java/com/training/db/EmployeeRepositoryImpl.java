package com.training.db;

import java.util.List;
import java.util.stream.Collectors;

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
		
		return getAllEmployee().stream().filter((e)->{
			
			int empSalary = e.getSalary();
			if(empSalary>=range1 & empSalary<=range2 )
			{
				return true;
			}
			else return false;
		}).collect(Collectors.toList());
		
	}

	@Override
	public Employee getEmployeeBasedOnId(int searchId) {

		return getAllEmployee().stream().filter((e)->{
			if(e.getEmpId() == searchId)
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		
	
		
	}

	@Override
	public Employee addNewEmployee(Employee e) {
		
		boolean status =  db.addEmployee(e);
		if(status) return e;
		else return null;
	}

	@Override
	public Employee updateEmployeeSalary(int searchEmpId, int newSalary) {
		
		// update set salary = 5000 from Employee where empId= 101 
		
		boolean isFound = false;
		Employee empToUpdate = null;
		int pos = -1;
		
		for (Employee e : getAllEmployee()) {
			pos++;
			if(e.getEmpId() == searchEmpId)
			{
				isFound = true;
				empToUpdate = e;
				break;
			}
		}
		
		if(isFound == true)
		{
			db.allEmployees.remove(pos);
			empToUpdate.setSalary(newSalary);
			db.allEmployees.add(empToUpdate);
		}
		return empToUpdate;
	}

}
