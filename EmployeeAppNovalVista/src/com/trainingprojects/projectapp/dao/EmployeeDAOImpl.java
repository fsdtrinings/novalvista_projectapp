package com.trainingprojects.projectapp.dao;

import java.util.List;

import com.trainingprojects.projectapp.entity.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {

	MyDatabase db;
	
	public EmployeeDAOImpl() {
		db = new MyDatabase();
	}
	
	
	@Override
	public Employee addNewEmployee(Employee e) {
		
		boolean status =  db.addEmployee(e);
		if(status == true) return e;
		else return null;
	}

	@Override
	public Employee updateEmployee(Employee e) {
		Employee updatedEmployee = db.updateEmployee(e.getEmpId(), e);
		return updatedEmployee;
	}

}
