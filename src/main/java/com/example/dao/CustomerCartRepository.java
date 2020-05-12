package com.example.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.CustomerCartEntity;
import com.example.model.CustomerCart;
import com.example.model.Product;

public interface CustomerCartRepository extends JpaRepository<CustomerCartEntity,Integer>{
	@Query("select c from CustomerCartEntity c where c.product.productId=?1 and c.customer.customerId=?2 "
			+ "and c.orderDate=?3")
	CustomerCartEntity findCart(int productId, int customerId, Date date);
	
	@Modifying
    @Query("update CustomerCartEntity c set c.quantity=c.quantity+1 where c.product.productId=?1 and c.customer.customerId=?2 and c.orderDate=?3 ")
	void update(int productId, int customerId, Date date);
/*	@Query("SELECT new com.example.model.CustomerCart"
			+ "(p.productId,p.productName,p.vendor.vendorId,p.status,c.categoryId,c.categoryName,p.price) "
			+ "FROM Product p inner JOIN p.product c ")
	    List<Product> fetchCart();
*/
	
	@Query("SELECT new com.example.model.CustomerCart"
			+ "(p.productName,p.price,c.quantity,p.price*c.quantity) "
			+ "FROM CustomerCartEntity c inner JOIN c.product p where "
			+ "c.customer.customerId=?1 and c.orderDate=?2")
			List<CustomerCart> showCart(int customerId,Date orderDate);
          

@Query("SELECT sum(p.price*cart.quantity) FROM  CustomerEntity cust "
			+ "inner join cust.CustomerCart cart inner join cart.product p "
			+ "where cust.customerId=?1 and cart.orderDate=?2")
			
	Float calculateBillAmount(int customerId,Date d);


}
