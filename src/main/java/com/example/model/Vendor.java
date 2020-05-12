package com.example.model;

import java.util.Date;



import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Vendor {
	@NotEmpty(message = "Name is mandatory")
	  @Size(min = 2, max = 30,message="Length is not correct")
	private String firstName;
	@NotEmpty(message = "Name is mandatory")
	  @Size(min = 2, max = 30,message="Length is not correct")
	private String lastName;
	@NotNull(message="write valid")
	 @DateTimeFormat(pattern="dd/MM/yyyy")
	    @Temporal(TemporalType.DATE)
	private Date dob;
	private String gender;
	@NotNull(message = "10 is mandatory")
	 @Size(min=10,max=10,message=" 10 digit only ")
	private String contactNumber;
	private String address;
	private String city;
	private String state;
	private int zip;
	@Email(message="write it in email format")
	private String email;
	@NotNull(message="mandatory")
	private int vendorId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;

}
