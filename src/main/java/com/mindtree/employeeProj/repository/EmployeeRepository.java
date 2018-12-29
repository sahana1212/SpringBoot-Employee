package com.mindtree.employeeProj.repository;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.employeeProj.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
