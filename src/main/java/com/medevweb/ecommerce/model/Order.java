package com.medevweb.ecommerce.model;

import java.sql.Date;

import jakarta.persistence.Column;

public class Order {
	
	
	@Column(name="order_id")
	private Integer orderId;
	private String number;
	@Column(name="created_at")
	private Date createdAt;
	@Column(name="reception_date")
	private Date receptionDate;
	private double total;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer orderId, String number, Date createdAt, Date receptionDate, double total) {
		super();
		this.orderId = orderId;
		this.number = number;
		this.createdAt = createdAt;
		this.receptionDate = receptionDate;
		this.total = total;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getReceptionDate() {
		return receptionDate;
	}

	public void setReceptionDate(Date receptionDate) {
		this.receptionDate = receptionDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", number=" + number + ", createdAt=" + createdAt + ", receptionDate="
				+ receptionDate + ", total=" + total + "]";
	}


}
