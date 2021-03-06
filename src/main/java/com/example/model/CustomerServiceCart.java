package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.entity.CustomerEntity;
import com.example.entity.ServiceEntity;

public class CustomerServiceCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="servicecart_id")
	private int servicecartId;
	
	@ManyToOne
	@JoinColumn(name = "service_id", referencedColumnName = "serviceId")
	private ServiceEntity service;

	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private CustomerEntity customer;

	@JoinColumn(name = "order_date")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	

	private float price;





	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}




	public int getServicecartId() {
		return servicecartId;
	}


	public void setServicecartId(int servicecartId) {
		this.servicecartId = servicecartId;
	}


	public ServiceEntity getService() {
		return service;
	}


	public void setService(ServiceEntity service) {
		this.service = service;
	}


	public CustomerEntity getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	private String status;

}
