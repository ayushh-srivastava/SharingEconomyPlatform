package com.example.service;


import java.util.ArrayList;


import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CategoryRepository;
import com.example.dao.ProductRepository;
import com.example.dao.ServiceCategoryRepository;
import com.example.dao.ServiceRepository;
import com.example.dao.VendorRepository;
import com.example.entity.CategoryEntity;
import com.example.entity.ProductEntity;
import com.example.entity.ServiceCategoryEntity;
import com.example.entity.ServiceEntity;
import com.example.entity.VendorEntity;
import com.example.model.Category;
import com.example.model.Product;
import com.example.model.ServiceCategory;
import com.example.model.Services;
import com.example.model.Vendor;
import com.example.model.VendorRegister;

@Service
public class VendorServiceImpl implements VendorService{
	@Autowired
	VendorRepository vendorDao;
	@Autowired
	ProductRepository productDao;
	@Autowired
	ServiceRepository serviceDao;
	@Autowired
	CategoryRepository categoryDao;
	@Autowired
	ServiceCategoryRepository servicecategoryDao;
	 @Autowired
	    private ModelMapper modelMapper;
	@Override
	@Transactional
	public Vendor validateVendor(VendorRegister vendor) {
		// TODO Auto-generated method stub
          Vendor vend=null;
		VendorEntity v=vendorDao.validateVendor(vendor.getVendorId(),vendor.getPassword());
	     if(v!=null)
	    	 { 
	    	 vend=modelMapper.map(v,Vendor.class);
	    	 }
		return vend;
	}

	@Override
	@Transactional
	public void addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		VendorEntity vend=modelMapper.map(vendor,VendorEntity.class);
		vendorDao.save(vend);
		
	}

	@Override
	public Vendor getVendor(int vendorId) {
		// TODO Auto-generated method stub
		Vendor vend=null;
		VendorEntity entity=vendorDao.getOne(vendorId);
		if(entity!=null)
		{
				
	vend=modelMapper.map(entity,Vendor.class);
		}
		return vend;
	    
	}

	@Override
	public void updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		VendorEntity vend=modelMapper.map(vendor,VendorEntity.class );
		vendorDao.save(vend);
	}
	@Transactional
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		ProductEntity productEntity=modelMapper.map(product, ProductEntity.class);
		productDao.save(productEntity);
		
	}
	@Transactional
	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		//ProductEntity prod=modelMapper.map(product,ProductEntity.class );
		productDao.updateProduct(product.getProductName(), product.getPrice(),
				product.getStatus(), product.getCategoryId(),product.getProductId());
	}
	@Override
	public Product getProduct(Integer productId) {
		// TODO Auto-generated method stub
		Product prod=null;
		ProductEntity entity=productDao.getOne(productId);
		if(entity!=null)
		{
				
	prod=modelMapper.map(entity,Product.class);
		}
		return prod;
	    
	}

	@Override
	public List<Product> fetchProduct(int vendorId) {
		// TODO Auto-generated method stub
		//return null;
		List<ProductEntity> entityList=productDao.fetchProducts(vendorId);
		List <Product> pList=new ArrayList<>();
		for(ProductEntity u:entityList) {
			Product p=modelMapper.map(u,Product.class);
			pList.add(p);
		}
		return pList;
		
		
	}
	@Transactional
	@Override
	public void addService(Services service) {
		// TODO Auto-generated method stub
		ServiceEntity serviceEntity=modelMapper.map(service, ServiceEntity.class);
		serviceDao.save(serviceEntity);
		
	}
	@Transactional
	@Override
	public void updateService(Services service) {
		// TODO Auto-generated method stub
		//ProductEntity prod=modelMapper.map(product,ProductEntity.class );
		serviceDao.updateService(service.getServiceName(), service.getPrice(),
				service.getServicecategoryId(),service.getStatus(),service.getContactNumber(),service.getZip(),service.getServiceId());
	}
	@Override
	public Services getService(Integer serviceId) {
		// TODO Auto-generated method stub
		Services serv=null;
		ServiceEntity entity=serviceDao.getOne(serviceId);
		if(entity!=null)
		{
				
	serv=modelMapper.map(entity,Services.class);
		}
		return serv;
	    
	}

	@Override
	public List<Services> fetchService(int vendorId) {
		// TODO Auto-generated method stub
		//return null;
		List<ServiceEntity> entityList=serviceDao.fetchServices(vendorId);
		List <Services> sList=new ArrayList<>();
		for(ServiceEntity u:entityList) {
			Services s=modelMapper.map(u,Services.class);
			sList.add(s);
		}
		return sList;
		
		
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
	
	


@Transactional
@Override


public void updateCategory(Category category) {
	// TODO Auto-generated method stub
	//ProductEntity prod=modelMapper.map(product,ProductEntity.class );
	categoryDao.updateCategory(category.getCategoryName(), category.getCategoryId());}
public void updateServiceCategory(ServiceCategory servicecategory) {
	// TODO Auto-generated method stub
	//ProductEntity prod=modelMapper.map(product,ProductEntity.class );
	servicecategoryDao.updateServiceCategory(servicecategory.getServicecategoryName(), servicecategory.getServiceCategoryId());}
}
