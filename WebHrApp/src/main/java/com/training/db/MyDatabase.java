package com.training.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.app.entity.Employee;

public class MyDatabase {

	public static List<Employee> allEmployees ; 
	
	static {
		
		Employee e1 = new Employee(101, "Ramesh", 2000);
		Employee e2 = new Employee(102, "Kavita", 12000);
		Employee e3 = new Employee(103, "Suraj", 8000);
		Employee e4 = new Employee(104, "Neha", 6000);
		
		
		allEmployees = Arrays.asList(e1,e2,e3,e4);
	}
}
