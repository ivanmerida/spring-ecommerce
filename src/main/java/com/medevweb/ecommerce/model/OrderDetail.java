package com.medevweb.ecommerce.model;

import jakarta.persistence.Column;

public class OrderDetail {

	@Column(name = "order_detail_id")
	private Integer orderDetailId;
	private String name;
	private double quantity;
	private double price;
	private double total;

	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(Integer orderDetailId, String name, double quantity, double price, double total) {
		super();
		this.orderDetailId = orderDetailId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}

	public Integer getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderDetailId=" + orderDetailId + ", name=" + name + ", quantity=" + quantity + ", price="
				+ price + ", total=" + total + "]";
	}

}
