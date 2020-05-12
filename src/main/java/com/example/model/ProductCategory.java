package com.example.model;

import javax.persistence.Table;

public class ProductCategory {

	private int productId;
	private String productName;
	private int vendorId;
	private String status;
	private int categoryId;
	private String categoryName;
	private float price;
	public ProductCategory()
	{}
	
	public ProductCategory(int productId, String productName,int vendorId,String status, int categoryId, String categoryName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.vendorId = vendorId;
		this.status = status;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
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

	

	

}