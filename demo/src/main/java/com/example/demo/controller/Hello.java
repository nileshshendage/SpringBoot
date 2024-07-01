package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeDataF;

@RestController
public class Hello {
	
	@Autowired
	EmployeeDataF objemp;
	
	
	@GetMapping("hello9")  
	public String hello()   
	{  
	return "message fetch successfully.";  
	}  
	
	
	// My own method
	@GetMapping("G9")
	public String myOwnMethod() 
	{
		return "I am now checking this with postman.";
		
	}
	
	
	
	
	
	@GetMapping("/getData")
	public List<Employee> getEmployeeList(){
//	 List<Employee> obj=null;
	 
		List<Employee> emp=null;	
		emp = objemp.getEmpData();
	 
	 return emp;
		
	}
	
	
	
	
}
