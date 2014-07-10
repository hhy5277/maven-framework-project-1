package org.hibernate.one2many.xml.bag.example;

import java.util.ArrayList;
import java.util.List;


public class Department {

	private Long departmentId;
	
	private String departmentName;
	
	private List<Employee> employees = new ArrayList<Employee>(0);

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}