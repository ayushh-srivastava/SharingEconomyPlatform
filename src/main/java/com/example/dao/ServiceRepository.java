package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.example.entity.ServiceEntity;

public interface ServiceRepository  extends JpaRepository<ServiceEntity,Integer> {
	@Query("select v from ServiceEntity v where v.vendor.vendorId=?1")
	List<ServiceEntity> fetchServices(int vendorId);
//	Product findEmployeeByName(String vendorId);

	@Modifying
	@Query("update ServiceEntity s set s.serviceName=?1, s.price=?2, s.servicecategory.servicecategoryId=?3,s.status=?4,s.contactNumber=?5,s.zip=?6 where s.serviceId=?7")
	int updateService(String sname, float price,int servicecategoryId,String status,String contactNumber,int zip,int serviceid);

}
