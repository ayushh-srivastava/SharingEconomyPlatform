package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
	@Query("select v from ProductEntity v where v.vendor.vendorId=?1")
	List<ProductEntity> fetchProducts(int vendorId);
//	Product findEmployeeByName(String vendorId);
	@Modifying
	@Query("update ProductEntity p set p.productName=?1, p.price=?2,p.status=?3,p.category.categoryId=?4 where p.productId=?5")
	int updateProduct(String pname, float price,String status,int categoryId,int productid);
}


