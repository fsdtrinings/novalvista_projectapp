package com.trainingprojects.projectapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.trainingprojects.projectapp.entity.Employee;
import com.trainingprojects.projectapp.entity.Project;

public class MyDatabase {

	public static List<Employee> allEmployees = new ArrayList<>();
	public static HashMap<Project, List<Employee>> allProjects = new HashMap<>();
	
	static {
		
		Employee e1 = new Employee(101, "Ramesh", 2000);
		Employee e2 = new Employee(102, "Suresh", 3000);
		Employee e3 = new Employee(103, "Mahesg", 2000);
		
		allEmployees = Arrays.asList(e1,e2,e3);
		
		
		Project p1 = new Project("New-Smart app", "HSBC-Bank");
		Project p2 = new Project("CabBooking app", "CityCabs");
		
		
		allProjects.put(p1, Arrays.asList(e1,e2));
		allProjects.put(p2, Arrays.asList(e3));
		
		// add few more records
	}

	
	public boolean addEmployee(Employee e)
	{
		return allEmployees.add(e);
	}
	
	public Employee updateEmployee(int searchEmpId,Employee updatedEmployee)
	{
		int pos = -1;
		boolean isFound = false;
		for(Employee e:allEmployees)
		{
			pos++;
			if(e.getEmpId() == searchEmpId)
			{
				isFound = true;
				break;
			}
		}
		
		if(isFound)
		{
			allEmployees.remove(pos);
			allEmployees.add(updatedEmployee);
			return updatedEmployee;
			
		}
		else return null;
				
	}
	
	public void addProject(Project p )
	{
		allProjects.put(p, null);
	}
	
	
}
