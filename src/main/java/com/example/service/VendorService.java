package com.example.service;


import java.util.List;


import javax.validation.Valid;

import com.example.model.Category;
import com.example.model.Product;
import com.example.model.ServiceCategory;
import com.example.model.Services;
import com.example.model.Vendor;
import com.example.model.VendorRegister;

public interface VendorService {

	public Vendor validateVendor(@Valid VendorRegister vendor);

	public void addVendor(Vendor vendor);

	public Vendor getVendor(int vendorId);

	public void updateVendor(Vendor vendor);
	public void addProduct(Product product);
	public void updateProduct(Product product);
	Product getProduct(Integer productId);

	public List<Product> fetchProduct(int vendorId);
	public void addCategory(Category category);

	//public List<Category> fetchCategory();

	public List<Category> fetchCategory();

	public void addService(Services service);

	public List<Services> fetchService(int vendorId);

	public Services getService(Integer serviceId);

	public void updateService(Services service);

	public void addServiceCategory(ServiceCategory servicecategory);

	public List<ServiceCategory> fetchServiceCategory();

	void updateCategory(Category category);
	void updateServiceCategory(ServiceCategory servicecategory);

	//Vendor getVendor(int vendorId);

	//List<Services> fetchService(int vendorId);

	
	//public Vendor getVendor(Integer vendorId);

	//Vendor getVendor(Integer vendorId);

	//public Product findEmployeeById(String vendorId);

	//public Product findEmployeeById(String vendorId);

	//public void deleteProduct(Product proId);

	//Product getProduct(String productId);


}
