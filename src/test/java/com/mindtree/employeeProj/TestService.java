package com.mindtree.employeeProj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.employeeProj.entity.Employee;
import com.mindtree.employeeProj.service.EmployeeService;
import com.mindtree.employeeProj.service.serviceImpl.EmployeeServiceImpl;

public class TestService {

	Employee employee = new Employee();
	EmployeeService employeeService = new EmployeeServiceImpl();

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void beforeTest() {
		employee.setEmpId(1);
		employee.setFullName("Anoop");
		employee.setDob("11-11-1111");
		employee.setEmailId("a@a");
		employee.setGender("Male");
		employee.setPassword("Anoop");
	}

	@Test
	public void testService() {
		Assert.assertNotNull(employee);
		Assert.assertEquals(1, employee.getEmpId());
		Assert.assertEquals("AAnoop", "AAnoop");
	}

	@After
	public void after() {
		System.out.println("After test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
