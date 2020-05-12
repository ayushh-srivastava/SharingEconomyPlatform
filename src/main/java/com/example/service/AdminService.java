package com.example.service;



import java.util.List;

import javax.validation.Valid;

import com.example.entity.Admin;
import com.example.model.Category;
import com.example.model.ServiceCategory;


public interface AdminService {



	public String checkAdminId(String adminId);

	public String checkPassword(String password);

	public Admin validateAdmin(@Valid Admin admin);
        void addCategory(Category category);

	List<Category> fetchCategory();

	void addServiceCategory(ServiceCategory servicecategory);

	List<ServiceCategory> fetchServiceCategory();
	
}
