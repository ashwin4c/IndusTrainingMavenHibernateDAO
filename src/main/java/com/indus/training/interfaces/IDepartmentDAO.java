package com.indus.training.interfaces;
import java.util.ArrayList;

import com.indus.training.model.Department;


public interface IDepartmentDAO {

	
	public Department getDeptDetailsByID(int deptId);
	
	public ArrayList<Department> getAllDepartments();
	
}
