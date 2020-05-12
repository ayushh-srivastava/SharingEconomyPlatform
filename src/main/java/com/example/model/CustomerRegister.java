package com.example.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CustomerRegister {

	@NotNull(message="NotNull.customer.customerId")
		private int customerId;
		public int getCustomerId() {
			return customerId;
		}


		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		@NotEmpty(message="Password is required")
		//@Size(min=6,max=15,message="Size.user.password")
		private String password;
		
		
		public String getPassword() {
			return password;
		}
		
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		

	}

