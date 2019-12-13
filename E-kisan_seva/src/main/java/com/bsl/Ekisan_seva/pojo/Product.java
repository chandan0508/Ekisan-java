package com.bsl.Ekisan_seva.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double price;
	private String information;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User")
	User user;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String name, double price, String information ) {
		super();
		this.name = name;
		this.price = price;
		this.information = information;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String getInformation() {
		return information;
	}
	 
	public void setInformation(String information) {
		this.information = information;
	}
}
