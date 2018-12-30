package com.viksuu.learn.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viksuu.learn.jpa.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
