package com.example.demo.entity;

public class Employee {

	private long Id;
	private String EmployeeName;
	private String EmployeeAdd;
	public Employee(long id, String employeeName, String employeeAdd) {
		
		Id = id;
		EmployeeName = employeeName;
		EmployeeAdd = employeeAdd;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeAdd() {
		return EmployeeAdd;
	}
	public void setEmployeeAdd(String employeeAdd) {
		EmployeeAdd = employeeAdd;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", EmployeeName=" + EmployeeName + ", EmployeeAdd=" + EmployeeAdd + "]";
	}
	
	
	
	
	
}
