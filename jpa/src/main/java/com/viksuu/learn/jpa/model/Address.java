package com.viksuu.learn.jpa.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "address")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Address implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String landmark;
	private Long pincode;

	
//	@JsonIgnore
//	@JsonManagedReference
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Employee employee;

	public Address() {
		super();
		System.out.println("zero const of address");
	}

	public Address(int id, String addressLine1, String addressLine2, String city, String landmark, Long pincode,
			Employee employee) {
		super();
		System.out.println("Parameterized Cons of address");
		this.id = id;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.landmark = landmark;
		this.pincode = pincode;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public Address setId(int id) {
		this.id = id;
		return this;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public Address setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
		return this;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public Address setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public String getLandmark() {
		return landmark;
	}

	public Address setLandmark(String landmark) {
		this.landmark = landmark;
		return this;
	}

	public Long getPincode() {
		return pincode;
	}

	public Address setPincode(Long pincode) {
		this.pincode = pincode;
		return this;
	}

	public Employee getEmployee() {
		return employee;
	}

	public Address setEmployee(Employee employee) {
		this.employee = employee;
		return this;
	}

	@Override
	public String toString() {
		return String.format(
				"Address [id=%s, addressLine1=%s, addressLine2=%s, city=%s, landmark=%s, pincode=%s]", id,
				addressLine1, addressLine2, city, landmark, pincode);
	}


}
