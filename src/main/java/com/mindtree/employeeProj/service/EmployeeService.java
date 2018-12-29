package com.mindtree.employeeProj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mindtree.employeeProj.entity.Employee;

@Service

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Optional<Employee> getEmployee(int id);

	public List<Employee> getAllEmployee();

	public void deleteEmployee(int id);

	public void updateEmployee(int id, Employee employee);

	public String validate(Employee employee);
}
