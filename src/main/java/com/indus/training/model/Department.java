package com.indus.training.model;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = -1983247472944084773L;

	private Integer departmentId;
	private String departmentName;
	private Integer managerId;
	private Integer locationId;

	public Department() {
		super();
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName="
				+ departmentName + ", managerId=" + managerId + ", locationId="
				+ locationId + "]";
	}

	

}
