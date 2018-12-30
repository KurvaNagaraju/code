package com.viksuu.learn.jpa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.viksuu.learn.jpa.dto.AddressDTO;
import com.viksuu.learn.jpa.dto.EmployeeDTO;
import com.viksuu.learn.jpa.mapper.AddressMapperImpl;
import com.viksuu.learn.jpa.mapper.EmployeeMapperImpl;
import com.viksuu.learn.jpa.model.Address;
import com.viksuu.learn.jpa.model.Employee;
import com.viksuu.learn.jpa.repository.AddressRepository;
import com.viksuu.learn.jpa.repository.EmployeeRepository;

@Service
@Component
public class EmployeeServices {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private AddressRepository addRepo;
	
	@Autowired
	private EmployeeMapperImpl empMapper;
	
	@Autowired
	private AddressMapperImpl addressMapper;

	public List<Employee> getAllEmployee() {

		/*
		 * Employee e = new Employee(); Date createdDate = new Date(); Date
		 * updatedDate = new Date();
		 * 
		 * Address current = new Address(); Address permanent = new Address();
		 * current.setAddressLine1("line1").setAddressLine2("Line2").setCity(
		 * "Patna").setLandmark("kbagh") .setPincode(1234L);
		 * permanent.setAddressLine1("line1").setAddressLine2("Line2").setCity(
		 * "Patna").setLandmark("kbagh") .setPincode(1234L); List<Address>
		 * address = new ArrayList<>(); address.add(current);
		 * address.add(permanent);
		 * 
		 * e.setId(1).setName("Vikash").setUpdated_date(updatedDate).
		 * setCreated_date(createdDate).setAddress(address); Employee emp =
		 * empRepo.saveAndFlush(e);
		 */
		List<Employee> listOfEmp = empRepo.findAll();

		List<EmployeeDTO> empDto = new ArrayList<>();
		/*listOfEmp.forEach(emp -> {
			EmployeeDTO dto = empMapper.mapToDTO(emp);
			empDto.add(dto);
		});*/
//		System.out.println(empDto);
		return listOfEmp;
	}

	public List<Employee> createEmployee(List<EmployeeDTO> employees) {
		List<Employee> newEmp = new ArrayList<>();

		ListIterator<EmployeeDTO> itr = employees.listIterator();
		try {
			while (itr.hasNext()) {
				EmployeeDTO e = (EmployeeDTO) itr.next();
				if (e.getCreated_date() == null) {
					Date createdDate = new Date();
					e.setCreated_date(createdDate);
				}
				Date updatedDate = new Date();
				e.setUpdated_date(updatedDate);

				List<Address> addr = e.getAddress();

				Employee emp = empMapper.mapToModel(e);
				
				addr.forEach(add -> add.setEmployee(emp));
				emp.setAddress(addr);
				
//				System.out.println(emp);
				Employee newEmployee = empRepo.saveAndFlush(emp);
				newEmp.add(newEmployee);
			}
		} catch (Exception e) {
			System.out.println("Exception is :: " + e);
		}
		return newEmp;
	}

	public List<AddressDTO> getAllAddress() {
		// TODO Auto-generated method stub
		List<AddressDTO> addDto = new ArrayList<>();
	
		List<Address> addModel = addRepo.findAll();
		addModel.forEach(add -> {
			AddressDTO obj = addressMapper.mapToDTO(add);
			addDto.add(obj);
		});
		return addDto;
		
	}

}

/*******************
 * Json Format ******************
 * 
 * [ {
 * 
 * "name": "Vikash", "Address": [ {
 * 
 * "addressLine1": "abcd", "addressLine2": "abcd", "city": "Patna", "landmark":
 * "kbagh", "pincode": 2345 }, {
 * 
 * "addressLine1": "abcd", "addressLine2": "abcd", "city": "Patna", "landmark":
 * "kbagh", "pincode": 2345
 * 
 * } ] }, {
 * 
 * "name": "Singh", "Address": [ {
 * 
 * "addressLine1": "asdf", "addressLine2": "asdf", "city": "Patna", "landmark":
 * "kbagh", "pincode": 2345 }, {
 * 
 * "addressLine1": "asdf", "addressLine2": "asdf", "city": "Patna", "landmark":
 * "kbagh", "pincode": 2345
 * 
 * } ] } ]
 *
 */
