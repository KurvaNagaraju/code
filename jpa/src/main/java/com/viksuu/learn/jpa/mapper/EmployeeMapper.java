package com.viksuu.learn.jpa.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.viksuu.learn.jpa.dto.EmployeeDTO;
import com.viksuu.learn.jpa.model.Employee;

@Component
public class EmployeeMapper {

	public EmployeeDTO EmployeeModelToDto(Employee model) {

		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(model.getId()).setName(model.getName()).setUpdated_date(model.getUpdated_date())
				.setCreated_date(model.getCreated_date()).setAddress(model.getAddress());

		return dto;
	}

	public Employee EmployeeDtoToModel(EmployeeDTO emp) {

		Employee empModel = new Employee();
		empModel.setId(emp.getId()).setName(emp.getName()).setCreated_date(emp.getCreated_date())
				.setUpdated_date(emp.getUpdated_date()).setAddress(emp.getAddress());

		return empModel;
	}

}
