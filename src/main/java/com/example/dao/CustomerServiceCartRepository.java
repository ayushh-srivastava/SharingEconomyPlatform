package com.example.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.CustomerServiceCartEntity;

public interface CustomerServiceCartRepository extends JpaRepository<CustomerServiceCartEntity,Integer> {
	@Query("select c from CustomerServiceCartEntity c where c.service.serviceId=?1 and c.customer.customerId=?2 "
			+ "and c.orderDate=?3")
	CustomerServiceCartEntity findCart(int serviceId, int customerId, Date date);
	
	//@Modifying
    //@Query("update CustomerServiceCartEntity c set c.quantity=c.quantity+1 where c.service.serviceId=?1 and c.customer.customerId=?2 and c.orderDate=?3 ")
	//void update(int serviceId, int customerId, Date date);
/*	@Query("SELECT new com.example.model.CustomerCart"
			+ "(p.productId,p.productName,p.vendor.vendorId,p.status,c.categoryId,c.categoryName,p.price) "
			+ "FROM Product p inner JOIN p.product c ")
	    List<Product> fetchCart();
*/
	@Query("SELECT s.price FROM  CustomerEntity cust "
			+ "inner join cust.CustomerServiceCart cart inner join cart.service s "
			+ "where cust.customerId=?1 and cart.orderDate=?2")
			
	Float calculateBillAmount(int customerId,Date d);

}
