package com.mindtree.employeeProj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mindtree.employeeProj.entity.Project;

@Service

public interface ProjectService {
	public void addProject(Project project);

	public Optional<Project> getProject(int projectId);

	public List<Project> getAllProjects();

	public void deleteProject(int id);
}
