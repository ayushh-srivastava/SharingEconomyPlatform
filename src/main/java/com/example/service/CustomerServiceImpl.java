package com.example.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CategoryRepository;
import com.example.dao.CustomerCartRepository;
import com.example.dao.CustomerRepository;
import com.example.dao.CustomerServiceCartRepository;
import com.example.dao.ProductRepository;
import com.example.dao.ServiceCategoryRepository;
import com.example.dao.ServiceRepository;
import com.example.entity.CustomerCartEntity;
import com.example.entity.CustomerEntity;
import com.example.entity.CustomerServiceCartEntity;
import com.example.entity.ProductEntity;
import com.example.entity.ServiceEntity;
import com.example.model.Customer;
import com.example.model.CustomerCart;
import com.example.model.CustomerRegister;
import com.example.model.Product;
import com.example.model.ProductCategory;
import com.example.model.ServiceCategory;
import com.example.model.ServiceProductCategory;
import com.example.model.Services;


	@Service
	
	public class CustomerServiceImpl implements CustomerService {
		@Autowired
		CustomerRepository customerDao;
		@Autowired
		ProductRepository productDao;
		 @Autowired
		 CategoryRepository categoryDao;
		 @Autowired
			ServiceRepository serviceDao;
			 @Autowired
			 ServiceCategoryRepository servicecategoryDao;
		 @Autowired
		    private ModelMapper modelMapper;
		 @Autowired
		 CustomerCartRepository customerCartDao;
                 @Autowired
	         CustomerServiceCartRepository customerServiceCartDao;
		 
		@Override
		@Transactional
		public CustomerRegister validateCustomer(CustomerRegister customer) {
			// TODO Auto-generated method stub
			CustomerRegister cust= null;
			CustomerEntity c=customerDao.validateCustomer(customer.getCustomerId(),customer.getPassword());
			if(c!=null)
				{ cust=modelMapper.map(c,CustomerRegister.class);
				
				}
			return cust;
		}

		@Override
		@Transactional
		public void addCustomer(Customer customer) {
			// TODO Auto-generated method stub
			CustomerEntity cust=modelMapper.map(customer,CustomerEntity.class);
			customerDao.save(cust);
			
		}
		@Override
		public List<Product> fetchProductss() {
			// TODO Auto-generated method stub
			//return null;
			List<ProductEntity> entityList=productDao.findAll();
			List <Product> p2List=new ArrayList<>();
			for(ProductEntity u:entityList) {
				Product p=modelMapper.map(u,Product.class);
				p2List.add(p);
			}
			return p2List;
		}

		@Override
	public List<ProductCategory> productCategoryDetails(String categoryName) {
		// TODO Auto-generated method stub
		return categoryDao.fetchProductCategoryDetails(categoryName);
	}
		
		
		@Override
		public List<Services> fetchServiceProductss() {
			// TODO Auto-generated method stub
			//return null;
			List<ServiceEntity> entityList=serviceDao.findAll();
			List <Services> s2List=new ArrayList<>();
			for(ServiceEntity u:entityList) {
				Services s=modelMapper.map(u,Services.class);
				s2List.add(s);
			}
			return s2List;
		}
		
		@Override
		public List<ServiceProductCategory> serviceCategoryDetails(String servicecategoryName) {
			// TODO Auto-generated method stub
			return servicecategoryDao. fetchServiceProductCategoryDetails(servicecategoryName);
		}

		
		@Transactional
		@Override
		public void addCart(int productId, int customerId) {
			// TODO Auto-generated method stub
			//Date date=(Date) new java.util.Date();
			java.util.Date date=new java.util.Date();
			CustomerCartEntity cart=new CustomerCartEntity();
			CustomerEntity customer=customerDao.getOne(customerId);
			ProductEntity product=productDao.getOne(productId);
			//ProductEntity price=productDao.getOne(price);
			CustomerCartEntity entity=customerCartDao.findCart(productId,customerId,date);
			if(entity!=null)
			{
			System.out.println("cart id="+entity.getCartId());
			customerCartDao.update(productId,customerId,date);
			}
			else
			{
			cart.setCustomer(customer);
			cart.setProduct(product);
			cart.setQuantity(1);
			//cart.setPrice(price);
			cart.setOrderDate(date);
			customerCartDao.save(cart);
		}
			}

		

		@Transactional
		@Override
		public Float generateBill(int customerId) {
		// TODO Auto-generated method stub
		java.util.Date date =new java.util.Date();
		Float amount=customerCartDao.calculateBillAmount(customerId,date);
		System.out.println("amount="+amount);//to check whether amount is calculated
		return amount;
		}
		
		@Override
		public List<CustomerCart> showCart(int customerId) {
		// TODO Auto-generated method stub
		java.util.Date d=new java.util.Date();
		List<CustomerCart> cart=customerCartDao.showCart(customerId,d);
		return cart;
		}
		
		@Override
		public void addServiceCart(int serviceId, int customerId) {
			// TODO Auto-generated method stub
			java.util.Date date=new java.util.Date();
			CustomerServiceCartEntity cart=new CustomerServiceCartEntity();
			CustomerEntity customer=customerDao.getOne(customerId);
			ServiceEntity service=serviceDao.getOne(serviceId);
	        cart.setCustomer(customer);
			cart.setService(service);
			cart.setOrderDate(date);
		
			
		}
                @Override
		public Float generateServiceBill(int customerId) {
			// TODO Auto-generated method stub
			java.util.Date date =new java.util.Date();
			Float amount=customerServiceCartDao.calculateBillAmount(customerId,date);
			System.out.println("amount="+amount);//to check whether amount is calculated
			return amount;
		}
		
		
	}	

	
