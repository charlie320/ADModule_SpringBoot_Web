package com.perscholas.springboot_basic_web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name = "User.findByEmail", query = "select u from User u where u.email = ?1")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@Size(min=2, max=25,  message="Name must be between 2 and 25 characters long.")
	@NotBlank(message="Name is required.")
	private String name;
	@Email(message="Please enter a valid email.")
	@NotBlank(message="Email is required.")
	private String email;
	@Size(min=8, max=16,  message="Password must be between 8 and 16 characters long.")
	@NotBlank(message="Password is required.")
	private String password;

	public User() {
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
