package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.CategoryEntity;
import com.example.entity.ProductEntity;
import com.example.model.Product;
import com.example.model.ProductCategory;

//import com.model.Employee;


	public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{
		@Modifying
		@Query("update CategoryEntity p set p.categoryName=?1 where p.categoryId=?2")
		int updateCategory(String category,int categoryId);
		//join query - joining Category and Product entity and return ProductCategory
		//model objects
		@Query("SELECT new com.example.model.ProductCategory"
				+ "(p.productId,p.productName,p.vendor.vendorId,p.status,c.categoryId,c.categoryName,p.price) "
				+ "FROM CategoryEntity c inner JOIN c.product p where c.categoryName=?1")
		List<ProductCategory> fetchProductCategoryDetails(String categoryName);
		
/*	@Query("SELECT new com.example.model.Product"
				+ "(p.productId,p.productName,p.vendor.vendorId,p.status,c.orderDate,c.quantity,p.price) "
				+ "FROM CustomerCartEntity c inner JOIN c.product p ")
		    List<ProductEntity> fetchCart();
		//List<Product> fetchCart();
*/

	//public void save(CategoryEntity vend) {
		// TODO Auto-generated method stub
		
	}
