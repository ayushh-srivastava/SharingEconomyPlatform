package com.example.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="servicecategory")
public class ServiceCategoryEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int servicecategoryId;
	

	@Column(name="servicecategory")
	private String servicecategoryName;
	
	@OneToMany(mappedBy = "servicecategory", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<ServiceEntity> service;
	
	

	public String getServicecategoryName() {
		return servicecategoryName;
	}

	public Set<ServiceEntity> getService() {
		return service;
	}

	public void setService(Set<ServiceEntity> service) {
		this.service = service;
	}

	public void setServicecategoryName(String servicecategoryName) {
		this.servicecategoryName = servicecategoryName;
	}
	public int getserviceCategoryId() {
		return servicecategoryId;
	}

	public void setserviceCategoryId(int servicecategoryId) {
		this.servicecategoryId = servicecategoryId;
	}

	
}
