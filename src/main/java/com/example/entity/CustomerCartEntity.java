package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="customer_cart")
public class CustomerCartEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cart_id")
	private int cartId;
	
	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "productId")
	private ProductEntity product;

	
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private CustomerEntity customer;

	@JoinColumn(name = "order_date")
	@Temporal(TemporalType.DATE)
	private Date orderDate;

	@JoinColumn(name = "quantity")
	private int quantity;
	
	
	
	/*@JoinColumn(name = "price")
	private float price;
	@JoinColumn(name="ProductName")
	private String ProductName;
	@JoinColumn(name="amount")
	private float amount;
	
	
	public CustomerCartEntity(int cartId, ProductEntity product, CustomerEntity customer, Date orderDate, int quantity,
			float price, String productName, float amount) {
		//super();
		this.cartId = cartId;
		this.product = product;
		this.customer = customer;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.price = price;
		ProductName = productName;
		this.amount = amount;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
*/
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int i) {
		this.quantity = i;
	}


}
