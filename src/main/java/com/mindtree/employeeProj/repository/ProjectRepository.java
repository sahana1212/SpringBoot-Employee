package com.mindtree.employeeProj.repository;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.employeeProj.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
