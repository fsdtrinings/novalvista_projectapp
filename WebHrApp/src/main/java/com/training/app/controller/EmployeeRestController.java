package com.training.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@GetMapping("/allemployee")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> allEmployees = empService.getAllEmployee(); 
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	}
}
