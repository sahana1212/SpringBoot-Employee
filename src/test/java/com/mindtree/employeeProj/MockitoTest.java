package com.mindtree.employeeProj;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import com.mindtree.employeeProj.entity.Employee;
import com.mindtree.employeeProj.repository.EmployeeRepository;
import com.mindtree.employeeProj.service.EmployeeService;
import com.mindtree.employeeProj.service.serviceImpl.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.Silent.class)
public class MockitoTest {

	static Employee employee = new Employee();

	@Mock
	EmployeeRepository employeeRepository;

	@InjectMocks
	static EmployeeService employeeService = new EmployeeServiceImpl();

	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Before
	public void setData() {
		MockitoAnnotations.initMocks(this);
		employee.setFullName("Jerry");
		employee.setDob("11-11-1111");
		employee.setEmailId("j@j");
		employee.setGender("Female");
		employee.setPassword("Jerry");
	}

	@Test
	public void testAddEmployee() {
		when(employeeRepository.save(employee)).thenReturn(employee);
		assertEquals(employee.getEmailId(), employeeService.addEmployee(employee).getEmailId());
	}

}
