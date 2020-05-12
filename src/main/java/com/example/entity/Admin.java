package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
@Table(name="admin")
public class Admin {
	@Id
	  @NotEmpty(message="NotEmpty.user.username")
      private String adminId;
	@NotEmpty(message="Password is required")
    @Size(min=6,max=15,message="Password should contain 6 to 15 characters")
	    private String password;
	    public String getAdminId() {
			return adminId;
		}

		public void setAdminId(String adminId) {
			this.adminId = adminId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    
	    

}
