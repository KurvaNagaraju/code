package com.viksuu.learn.jpa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.viksuu.learn.jpa.dto.AddressDTO;
import com.viksuu.learn.jpa.model.Address;


@Mapper
public interface AddressMap {
	
	AddressMap addressMapper = Mappers.getMapper(AddressMap.class);
	
	public AddressDTO addressToAddressDTO (Address address);
	
	public Address addressDTOToAddress (AddressDTO addressDTO);
		

}