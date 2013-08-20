package com.indus.training.dao;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.indus.training.interfaces.IDepartmentDAO;
import com.indus.training.model.Department;



public class DepartmentDAO extends HibernateDaoSupport implements IDepartmentDAO{

	public Department getDeptDetailsByID(int deptId) {

		Department dept =  (Department) getHibernateTemplate().get(Department.class, deptId) ;
		return dept;
		
	}

	public ArrayList<Department> getAllDepartments() {

		List li = getHibernateTemplate().find("from Department") ;
		
		ArrayList<Department> depts = new ArrayList<Department>() ;
		
		Department dept = null ;
		for(Object obj:li){
			dept = (Department) obj ;
			depts.add(dept) ;
		}
		
		return depts;
	}
	
	
}
