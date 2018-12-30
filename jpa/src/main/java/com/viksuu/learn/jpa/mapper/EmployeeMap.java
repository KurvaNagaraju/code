package com.viksuu.learn.jpa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.viksuu.learn.jpa.dto.EmployeeDTO;
import com.viksuu.learn.jpa.model.Employee;


@Mapper
public interface EmployeeMap {
	
	EmployeeMap employeeMapper = Mappers.getMapper(EmployeeMap.class);
	
	public EmployeeDTO employeeToEmployeeDTO (Employee employee);
	
	public Employee employeeDTOToEmployee (EmployeeDTO employeeDTO);
		

}