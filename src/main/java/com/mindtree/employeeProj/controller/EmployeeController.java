package com.mindtree.employeeProj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.employeeProj.entity.Employee;
import com.mindtree.employeeProj.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// Controller to add Employee when request arrives
	@RequestMapping(method = RequestMethod.POST, value = "/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	// Controller to get employee by id
	@RequestMapping(method = RequestMethod.GET, value = "/getEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	// Controller to get all employees
	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> employees() {
		return employeeService.getAllEmployee();
	}

	// Controller to delete employee by id
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		employeeService.updateEmployee(id, employee);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/validate")
	public String validate(@RequestBody Employee employee) {
		return employeeService.validate(employee);
	}
}
