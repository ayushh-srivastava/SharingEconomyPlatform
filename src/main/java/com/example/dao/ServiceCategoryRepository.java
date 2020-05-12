package com.example.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.ServiceCategoryEntity;
import com.example.model.ProductCategory;
import com.example.model.ServiceCategory;
import com.example.model.ServiceProductCategory;

public interface ServiceCategoryRepository extends JpaRepository<ServiceCategoryEntity, Integer>{
	@Modifying
	@Query("update ServiceCategoryEntity s set s.servicecategoryName=?1 where s.servicecategoryId=?2")
	int updateServiceCategory(String servicecategory,int servicecategoryId);
	//join query - joining Category and Product entity and return ProductCategory
			//model objects
			@Query("SELECT new com.example.model.ServiceProductCategory"
					+ "(s.serviceId,s.serviceName,s.vendor.vendorId,s.status,c.servicecategoryId,c.servicecategoryName,s.price,s.contactNumber,s.zip) "
					+ "FROM ServiceCategoryEntity c inner JOIN c.service s where c.servicecategoryName=?1")
			List<ServiceProductCategory> fetchServiceProductCategoryDetails(String servicecategoryName);
}
