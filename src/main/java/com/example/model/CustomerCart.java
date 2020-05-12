package com.example.model;

public class CustomerCart {
 private String productName;
 private int quantity;
 private float price;
 private float amount;
 
 
public CustomerCart(String productName, float price,int quantity, float amount) {
	
	this.productName = productName;
	this.quantity = quantity;
	this.price = price;
	this.amount = amount;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
 
}