package com.yrrhelp.models;

public class Product {

	private String id;
	private String name;
	private double price;
	private double gst;
	
	
	public Product(String id, String name, double price, double gst) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.gst = gst;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public double getSeller() {
		return gst;
	}
	public void setSeller(double gst) {
		this.gst = gst;
	}
	 
	
}
