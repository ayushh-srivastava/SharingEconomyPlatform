package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.VendorEntity;
@Repository
public interface VendorRepository  extends JpaRepository<VendorEntity,Integer>  {
	@Query("select v from VendorEntity v where vendorId=?1 and password=?2")
	VendorEntity validateVendor(int vendorId, String password);

}
