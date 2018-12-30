package com.viksuu.learn.jpa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "employee")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", unique = false, nullable = false, columnDefinition = "VARCHAR(100)")
	private String name;

	@Column(name = "created_date", nullable = false, columnDefinition = "TIMESTAMP")
	private Date created_date;

	@Column(name = "updated_date", nullable = false, columnDefinition = "TIMESTAMP")
	private Date updated_date;


//	@JsonBackReference
	@OneToMany(mappedBy="employee",cascade=CascadeType.ALL,fetch =FetchType.LAZY)
	private List<Address> address;

	public Employee() {
		super();
	}

	

	public Employee(Integer id, String name, Date created_date, Date updated_date,
			List<com.viksuu.learn.jpa.model.Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public Employee setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public Employee setCreated_date(Date created_date) {
		this.created_date = created_date;
		return this;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public Employee setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
		return this;
	}

	public List<Address> getAddress() {
		return address;
	}

	public Employee setAddress(List<Address> address) {
		this.address = address;
//		address.forEach(add -> add.setEmployee(this));
		return this;
	}


	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, created_date=%s, updated_date=%s,address=%s]", id, name, created_date,
				updated_date,address);
	}

	
	

}
