package com.viksuu.learn.jpa.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.viksuu.learn.jpa.dto.EmployeeDTO;
import com.viksuu.learn.jpa.model.Employee;



@Component
public class EmployeeMapperImpl {


	public Employee mapToModel(EmployeeDTO employeeDTO){
		
		Employee empolyeeModel = new Employee();
		empolyeeModel = EmployeeMap.employeeMapper.employeeDTOToEmployee(employeeDTO);
		return empolyeeModel;
	}

	
	public EmployeeDTO mapToDTO(Employee employee){
		EmployeeDTO employeeDto = new EmployeeDTO();
		employeeDto = EmployeeMap.employeeMapper.employeeToEmployeeDTO(employee);
		return employeeDto;
		
		}
	
	
}
