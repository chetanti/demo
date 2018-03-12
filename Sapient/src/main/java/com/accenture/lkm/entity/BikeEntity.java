package com.accenture.lkm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="bikemaster")
public class BikeEntity {

	@Id
	@Column(name="bikeid")
	private Integer bikeId;
	
	@Column(name="bikename")
	private String bikeName;
	
	@Column(name="price")
	private double price;
	
	@Column(name="company")
	private String company;

	
	public BikeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BikeEntity(Integer bikeId, String bikeName, double price,
			String company) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.price = price;
		this.company = company;
	}

	public Integer getBikeId() {
		return bikeId;
	}

	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "BikeEntity [bikeId=" + bikeId + ", bikeName=" + bikeName
				+ ", price=" + price + ", company=" + company + "]";
	}
	
	
	
	
}
