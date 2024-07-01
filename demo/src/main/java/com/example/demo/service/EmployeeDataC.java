package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
@Service
public class EmployeeDataC implements EmployeeDataF {
    List<Employee> emp=null;
    
	public EmployeeDataC() {
		emp= new ArrayList<>();
		emp.add(new Employee(1,"Nilesh","Test"));
		emp.add(new Employee(2,"Sandesh","Demo"));
//		emp.add(new Employee(3,"Ashish","TestDemo"));
		
	}

	@Override
	public List<Employee> getEmpData() {
		// TODO Auto-generated method stub
		return emp;
	}

}
