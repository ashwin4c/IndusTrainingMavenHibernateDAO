package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.dao.DepartmentDAO;
import com.indus.training.interfaces.IDepartmentDAO;

public class TestDepartmentDAO {

	IDepartmentDAO deptDAO = null;
	
	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml") ;
		deptDAO = (IDepartmentDAO) ctx.getBean("deptDAO") ;	
		
		if(ctx!=null){
			ctx.close();
		}
	}

	@After
	public void tearDown() throws Exception {
		deptDAO = null ;
		
	}

	@Test
	public void test() {
		System.out.println(deptDAO.getDeptDetailsByID(10).getDepartmentName());
	}

}
