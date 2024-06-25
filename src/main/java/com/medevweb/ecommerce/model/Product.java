package com.medevweb.ecommerce.model;

import jakarta.persistence.Column;

public class Product {

	@Column(name = "product_id")
	private Integer productId;
	private String name;
	private String description;
	private String image;
	private double price;
	private int quantity;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer productId, String name, String description, String image, double price, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", image="
				+ image + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

}
