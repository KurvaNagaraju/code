package com.viksuu.learn.jpa.dto;

import com.viksuu.learn.jpa.model.Employee;

public class AddressDTO {
	
	private int id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String landmark;
	private Long pincode;
	private Employee employee;
	public AddressDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public AddressDTO setId(int id) {
		this.id = id;
		return this;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public AddressDTO setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public AddressDTO setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}
	public String getCity() {
		return city;
	}
	public AddressDTO setCity(String city) {
		this.city = city;
		return this;
	}
	public String getLandmark() {
		return landmark;
	}
	public AddressDTO setLandmark(String landmark) {
		this.landmark = landmark;
		return this;
	}
	public Long getPincode() {
		return pincode;
	}
	public AddressDTO setPincode(Long pincode) {
		this.pincode = pincode;
		return this;
	}
	public Employee getEmployee() {
		return employee;
	}
	public AddressDTO setEmployee(Employee employee) {
		this.employee = employee;
		return this;
	}
	@Override
	public String toString() {
		return String.format(
				"AddressDTO [id=%s, addressLine1=%s, addressLine2=%s, city=%s, landmark=%s, pincode=%s, employee=%s]",
				id, addressLine1, addressLine2, city, landmark, pincode, employee);
	}
	
	
	
	

}
