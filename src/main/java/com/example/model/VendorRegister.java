package com.example.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class VendorRegister {
	@NotNull(message="NotNull.vendor.vendorId")
	private int vendorId;
	public int getVendorId() {
		return vendorId;
	}


	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}


	
	//@Size(min=6,max=15,message="Size.user.password")
	private String password;
	
	@NotEmpty(message="Password is required")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}

}
