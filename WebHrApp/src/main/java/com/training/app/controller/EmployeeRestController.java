package com.training.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.app.entity.Employee;
import com.training.app.service.EmployeeService;
import com.training.app.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/hrapp") // request mapping over class is used to provide root level URL mapping
public class EmployeeRestController {

	EmployeeService empService;
	
		
	public EmployeeRestController() {
		System.err.println("===>. Inside contructor");
		empService = new EmployeeServiceImpl();
	}

	@GetMapping("/")
	public String forHomePage()
	{
		return "Welcome to HR App";
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> allEmployees = empService.getAllEmployee(); 
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	}
	
	
	@GetMapping("/employee/{searchId}")
	public Employee getAllEmployeesBasedOnId(@PathVariable int searchId)
	{  
		 
		return empService.getEmployeeBasedOnId(searchId);
		
		// try to avoid returning data without ResponseEntity , as HttpSatatus is missing
	}
	
	@GetMapping("/employee/salary")
	public ResponseEntity<List<Employee>> getAllEmployeesBasedOnId(@RequestParam int r1,@RequestParam int r2)
	{  
		List<Employee> selectedEmployees = empService.getAllEmployeeBasedOnSalary(r1, r2);
		
		return new ResponseEntity<List<Employee>>(selectedEmployees,HttpStatus.OK);
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e)
	{
		Employee savedEmployee = empService.addNewEmployee(e);
		
		return new ResponseEntity<Employee>(savedEmployee,HttpStatus.OK);
	}
	
	
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee e)
	{
		Employee updatedEmployee = empService.updateEmployeeSalary(e);
		
		if(updatedEmployee != null)
		{
			return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end class
