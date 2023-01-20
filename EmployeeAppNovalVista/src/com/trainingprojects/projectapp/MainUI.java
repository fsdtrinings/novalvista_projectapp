package com.trainingprojects.projectapp;

import com.trainingprojects.projectapp.entity.Employee;
import com.trainingprojects.projectapp.service.EmployeeServiceImpl;
import com.trainingprojects.projectapp.service.IEmployeeService;

public class MainUI {

	IEmployeeService empService;
	
	public MainUI() {
		empService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		
		// whole MENU of task in SRS 
		
		while(true)
		{
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Add Project");
			System.out.println("4. Add Employee in Project");
			System.out.println("5. Remove Employee From Project");
			System.out.println("6. Get Employees Based On Project");
			
			
			
		}
		
		
	}//end main
	
	public void addEmployee()
	{
		// code to get employee details from Scanner 
		
		Employee e = new Employee(); // insert user input value to form actual employee object
		
		Employee savedEmployee = empService.addNewEmployee(e);
		if(savedEmployee != null)
		{
			System.out.println("Employee Saved "+savedEmployee);
		}
		else
		{
			System.out.println("Employee Not saved , pls. contact to customer care ");
		}
		
	}
	
	public void updateEmployee()
	{
		// scanner code to get updated employee information 
		
		Employee e = new Employee(); // insert user input value to form actual employee object
		
		Employee updatedEmployee = empService.updateEmployee(e);
		if(updatedEmployee != null)
		{
			
		}
		else
		{
			
		}
	}
	
	
	
	
}//end class
