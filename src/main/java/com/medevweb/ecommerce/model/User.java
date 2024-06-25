package com.medevweb.ecommerce.model;

import jakarta.persistence.Column;

public class User {
	
	@Column(name="user_id")
	private Integer userId;
	
	private String name;
	private String username;
	private String email;
	private String address;
	private String telephone;
	private String role;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer userId, String name, String username, String email, String address, String telephone,
			String role, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
		this.role = role;
		this.password = password;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", address=" + address + ", telephone=" + telephone + ", role=" + role + ", password=" + password
				+ "]";
	}
	
}
