package com.trainingprojects.projectapp.service;

import com.trainingprojects.projectapp.entity.Employee;
import com.trainingprojects.projectapp.entity.Project;

public interface IProjectService {

	public Project addNewProject(Project p);
	public int addNewResourceInProject(Project p,Employee e);
	public int removeResourceFromProject(Project p,Employee e);
	
}
