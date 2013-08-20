package com.indus.training.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.interfaces.IDepartmentDAO;
import com.indus.training.model.Department;

public class TestDepartmentDAOForAllDepartments {

	IDepartmentDAO deptDAO = null;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml") ;
		deptDAO = (IDepartmentDAO) ctx.getBean("deptDAO") ;	
		ctx = null ;
	}

	@After
	public void tearDown() throws Exception {
		deptDAO = null ;
		
	}

	@Test
	public void test() {
		ArrayList<Department> depts = deptDAO.getAllDepartments();
		
		
		for(Department dept : depts){
			System.out.println(dept);
		}
		
	}

}
