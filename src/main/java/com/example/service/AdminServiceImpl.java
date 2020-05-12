package com.example.service;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.AdminRepository;
import com.example.dao.CategoryRepository;
import com.example.dao.ServiceCategoryRepository;
import com.example.entity.Admin;
import com.example.entity.CategoryEntity;
import com.example.entity.ServiceCategoryEntity;
import com.example.model.Category;
import com.example.model.ServiceCategory;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminDao;
	@Autowired
	CategoryRepository categoryDao;
	@Autowired
	ServiceCategoryRepository servicecategoryDao;
	 @Autowired
	    private ModelMapper modelMapper;


	@Override
	@Transactional
	public Admin validateAdmin(@Valid Admin admin) {
		// TODO Auto-generated method stub
		Admin a=adminDao.validateAdmin(admin.getAdminId(),admin.getPassword());
		return a;
	}
	@Transactional
	@Override
	public String checkAdminId(String adminId) {
	return adminDao.checkAdminId(adminId);

	}
	@Transactional
	@Override
	public String checkPassword(String adminId) {
	return adminDao.checkPassword(adminId);
	}
@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		CategoryEntity vend=modelMapper.map(category,CategoryEntity.class);
		categoryDao.save(vend);
	}
@Override
	public List<Category> fetchCategory() {
		// TODO Auto-generated method stub
		//return null;
		List<CategoryEntity> entityList=categoryDao.findAll();//fetchProduct(vendorId);
		List <Category> p1List=new ArrayList<>();
		for(CategoryEntity u:entityList) {
			Category p=modelMapper.map(u,Category.class);
			p1List.add(p);
		}
		return p1List;
}
@Override
public void addServiceCategory(ServiceCategory servicecategory) {
	// TODO Auto-generated method stub
	ServiceCategoryEntity vend=modelMapper.map(servicecategory,ServiceCategoryEntity.class);
	servicecategoryDao.save(vend);
}
@Override
public List<ServiceCategory> fetchServiceCategory() {
	// TODO Auto-generated method stub
	//return null;
	List<ServiceCategoryEntity> serviceentityList=servicecategoryDao.findAll();//fetchProduct(vendorId);
	List <ServiceCategory> s1List=new ArrayList<>();
	for(ServiceCategoryEntity u:serviceentityList) {
		ServiceCategory s=modelMapper.map(u,ServiceCategory.class);
		s1List.add(s);
	}
	return s1List;
}

}
