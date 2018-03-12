package com.product.globalmart1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="productmaster")
public class ProductEntity {

	@Id
	private Integer id;
	private String productName;
	private String productType;
	private String description;
	private double price;
	
	public ProductEntity() {
		
	}
	public ProductEntity(Integer id, String productName, String productType, String description, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
		this.description = description;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
