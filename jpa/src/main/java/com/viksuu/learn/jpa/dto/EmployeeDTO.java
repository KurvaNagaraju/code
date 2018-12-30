package com.viksuu.learn.jpa.dto;

import java.util.Date;
import java.util.List;

import com.viksuu.learn.jpa.model.Address;

public class EmployeeDTO {

	private Integer id;
	private String name;
	private Date created_date;
	private Date updated_date;
	private List<Address> address;

	public EmployeeDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public EmployeeDTO setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public EmployeeDTO setName(String name) {
		this.name = name;
		return this;
	}

	public List<Address> getAddress() {
		return address;
	}

	public EmployeeDTO setAddress(List<Address> address) {
		this.address = address;
		return this;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public EmployeeDTO setCreated_date(Date created_date) {
		this.created_date = created_date;
		return this;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public EmployeeDTO setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
		return this;
	}

	@Override
	public String toString() {
		return String.format("EmployeeDTO [id=%s, name=%s, address=%s, created_date=%s, updated_date=%s]", id, name,
				address, created_date, updated_date);
	}

}
