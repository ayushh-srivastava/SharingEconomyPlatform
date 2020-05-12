package com.example.model;

import javax.persistence.Table;

public class ServiceProductCategory {

	private int serviceId;
	private String serviceName;
	private int vendorId;
	private String status;
	private int servicecategoryId;
	private String servicecategoryName;
	private float price;
	private String contactNumber;
	private int zip;
	public ServiceProductCategory()
	{}
	
	public ServiceProductCategory(int serviceId, String serviceName,int vendorId,String status,int servicecategoryId, String servicecategoryName, float price,String contactNumber,int zip) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.vendorId = vendorId;
		this.status = status;
		this.servicecategoryId = servicecategoryId;
		this.servicecategoryName = servicecategoryName;
		this.price = price;
		this.contactNumber=contactNumber;
		this.zip=zip;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getServicecategoryId() {
		return servicecategoryId;
	}

	public void setServicecategoryId(int servicecategoryId) {
		this.servicecategoryId = servicecategoryId;
	}

	public String getServicecategoryName() {
		return servicecategoryName;
	}

	public void setServicecategoryName(String servicecategoryName) {
		this.servicecategoryName = servicecategoryName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	

	

}
