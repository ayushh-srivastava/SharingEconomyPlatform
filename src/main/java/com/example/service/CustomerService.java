package com.example.service;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.example.entity.CustomerCartEntity;
import com.example.model.Customer;
import com.example.model.CustomerCart;
import com.example.model.CustomerRegister;
import com.example.model.Product;
import com.example.model.ProductCategory;
import com.example.model.ServiceCategory;
import com.example.model.ServiceProductCategory;
import com.example.model.Services;

public interface CustomerService {

	public CustomerRegister validateCustomer( @Valid CustomerRegister customer);

	public void addCustomer(Customer customer);

	public List<Product> fetchProductss();

	public List<ProductCategory> productCategoryDetails(String categoryName);

	public List<Services> fetchServiceProductss();

	public List<ServiceProductCategory> serviceCategoryDetails(String servicecategoryName);
	
	void addCart(int productId, int customerId);

	
	public Float generateBill(int customerId);

	
	public List<CustomerCart> showCart(int customerId);
	public void addServiceCart(int serviceId, int customerId);
        public Float generateServiceBill(int customerId);




	 

}
