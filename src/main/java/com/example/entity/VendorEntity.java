package com.example.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name="vendor")
	public class VendorEntity {
		@Id
		@Column(name="vendor_id")
		private int vendorId;
		@Column(name="password")
		private String password;
		@Column(name="first_name",length = 30)
		private String firstName;
		@Column(name="last_name",length = 30)
		private String lastName;
		@Column(name="dob")
		private Date dob;
		@Column(name="contact_number")
	    private long contactNumber;
		@Column(name="address")
		private String address;
		@Column(name="city")
		private String city;
		@Column(name="state")
		private String state;
		@Column(name="email")
		private String email;
		@Column(name="zip")
		private int zip;
		@OneToMany(mappedBy = "vendor", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
		 private Set<ProductEntity> product;
		@OneToMany(mappedBy = "vendor", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
		private Set<ServiceEntity> service;
		
		public Set<ServiceEntity> getService() {
			return service;
		}
		public void setService(Set<ServiceEntity> service) {
			this.service = service;
		}
		public Set<ProductEntity> getProduct() {
			return product;
		}
		public void setProduct(Set<ProductEntity> product) {
			this.product = product;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public int getVendorId() {
			return vendorId;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setVendorId(int vendorId) {
			this.vendorId = vendorId;
		}
		
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		


	}


