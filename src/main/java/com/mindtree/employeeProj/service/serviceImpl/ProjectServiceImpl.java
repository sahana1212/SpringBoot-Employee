package com.mindtree.employeeProj.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeeProj.entity.Project;
import com.mindtree.employeeProj.repository.ProjectRepository;
import com.mindtree.employeeProj.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	List<Project> projects = new ArrayList<Project>();

	@Override
	public void addProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public Optional<Project> getProject(int projectId) {
		return projectRepository.findById(projectId);
	}

	@Override
	public List<Project> getAllProjects() {
		projects = new ArrayList<>();
		projectRepository.findAll().forEach(projects::add);
		return projects;
	}

	@Override
	public void deleteProject(int id) {
		projectRepository.deleteById(id);
	}

}
