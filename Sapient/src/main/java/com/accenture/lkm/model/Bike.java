package com.accenture.lkm.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Bike {

	@NotEmpty
	private Integer bikeId;
	
	@NotNull
	private String bikeName;
	
	@NotEmpty
	private double price;
	
	@NotNull
	private String company;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(Integer bikeId, String bikeName, double price, String company) {
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
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", price="
				+ price + ", company=" + company + "]";
	}
	
	
}
