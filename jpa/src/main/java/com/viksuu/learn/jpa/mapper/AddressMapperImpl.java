package com.viksuu.learn.jpa.mapper;

import org.springframework.stereotype.Component;

import com.viksuu.learn.jpa.dto.AddressDTO;
import com.viksuu.learn.jpa.model.Address;



@Component
public class AddressMapperImpl {


	public Address mapToModel(AddressDTO addressDTO){
		
		Address addressModel = new Address();
		addressModel = AddressMap.addressMapper.addressDTOToAddress(addressDTO);
		return addressModel;
	}

	
	public AddressDTO mapToDTO(Address address){
		AddressDTO employeeDto = new AddressDTO();
		employeeDto = AddressMap.addressMapper.addressToAddressDTO(address);
		return employeeDto;
		
		}
	
	
}
