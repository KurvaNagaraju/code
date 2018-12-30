package com.viksuu.learn.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viksuu.learn.jpa.dto.AddressDTO;
import com.viksuu.learn.jpa.dto.EmployeeDTO;
import com.viksuu.learn.jpa.model.Employee;
import com.viksuu.learn.jpa.service.EmployeeServices;

@Component
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServices empService;
	
	@RequestMapping(value="/getEmp",method = RequestMethod.GET)
	public List<Employee> getEmployee(){
	
		List<Employee> emp = empService.getAllEmployee();
		
		return emp;
	}
	
	@RequestMapping(value="/getAddress",method = RequestMethod.GET)
	public List<AddressDTO> getAddress(){
	
		List<AddressDTO> emp = empService.getAllAddress();
		
		return emp;
	}
	
	
	@PostMapping(value="/createEmp")
	public List<Employee> createEmployee(@RequestBody List<EmployeeDTO> employees){
		
		List<Employee> emp = empService.createEmployee(employees);
		System.out.println(emp);
		return emp;
	}
	
	
	
}
