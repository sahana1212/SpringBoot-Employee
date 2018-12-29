package com.mindtree.employeeProj.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeeProj.entity.Employee;
import com.mindtree.employeeProj.repository.EmployeeRepository;
import com.mindtree.employeeProj.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	List<Employee> employees = new ArrayList<Employee>();

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		return employeeRepository.findById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public void updateEmployee(int id, Employee employee) {

		for (int i = 0; i < employees.size(); i++) {
			if (employee.getEmpId() == id) {
				employees.set(i, employee);
				return;
			}
		}
		employeeRepository.save(employee);
	}

	@Override
	public String validate(Employee employee) {
		employees = getAllEmployee();
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getEmailId().equals(employee.getEmailId())
					&& employees.get(i).getPassword().equals(employee.getPassword())) {
				return "Valid";

			}
		}
		return "Invalid";

	}

}
