package com.example.entity;
//package com.example.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name="customer")
	public class CustomerEntity {
		@Id
		@Column(name="customer_id")
		private int customerId;
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
		
		@OneToMany(mappedBy = "customer")
	    private Set<CustomerCartEntity> CustomerCart;
            @OneToMany(mappedBy = "customer")
	    private Set<CustomerServiceCartEntity> CustomerServiceCart;
            public Set<CustomerServiceCartEntity> getCustomerServiceCart() {
			return CustomerServiceCart;
		}
		public void setCustomerServiceCart(Set<CustomerServiceCartEntity> customerServiceCart) {
			CustomerServiceCart = customerServiceCart;
		}
	
	public Set<CustomerCartEntity> getCustomerCart() {
		return CustomerCart;
	}
	public void setProduct(Set<CustomerCartEntity> CustomerCart) {
		this.CustomerCart=CustomerCart;
	}
		
		
		
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public int getCustomerId() {
			return customerId;
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
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		
		@Column(name="firstname")
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
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


