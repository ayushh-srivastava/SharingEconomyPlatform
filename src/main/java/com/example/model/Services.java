package com.example.model;

import javax.persistence.Id;

public class Services {
	@Id
	private int serviceId;
	private String serviceName;
	private float price;
	private int servicecategoryId;
	private String servicecategoryName;
	public String getServicecategoryName() {
		return servicecategoryName;
	}
	public void setServicecategoryName(String servicecategoryName) {
		this.servicecategoryName = servicecategoryName;
	}
	private String status;
	private String contactNumber;
	private int zip;
	private String vendorId;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getServicecategoryId() {
		return servicecategoryId;
	}
	public void setServicecategoryId(int servicecategoryId) {
		this.servicecategoryId = servicecategoryId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	
}
