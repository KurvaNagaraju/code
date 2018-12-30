package com.viksuu.learn.jpa.mapper;

import org.springframework.stereotype.Component;

import com.viksuu.learn.jpa.dto.AddressDTO;
import com.viksuu.learn.jpa.model.Address;

@Component
public class AddressMapper {

	public AddressDTO addressModelToDto(Address model) {
		AddressDTO dto = new AddressDTO();
		dto.setId(model.getId()).setAddressLine1(model.getAddressLine1()).setAddressLine2(model.getAddressLine2())
				.setCity(model.getCity()).setLandmark(model.getLandmark()).setPincode(model.getPincode()).setEmployee(model.getEmployee());

		return null;
	}

	public Address addressDtoToModel(AddressDTO dto) {

		Address model = new Address();
		model.setId(dto.getId()).setAddressLine1(dto.getAddressLine1()).setAddressLine2(dto.getAddressLine2())
		.setCity(dto.getCity()).setLandmark(dto.getLandmark()).setPincode(dto.getPincode()).setEmployee(dto.getEmployee());;
		return null;
	}
}
