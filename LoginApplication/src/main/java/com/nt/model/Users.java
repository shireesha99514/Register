package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Users {
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;
	 */
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String email;

	
	private String name;
	
	private long mobile;  
	
	private String password;
	
	public Users() {
		
	}

	public Users(String email, String name, long mobileNumber, String password) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobileNumber;
		this.password = password;
	}

	
	public long getMobile() {
		return mobile;
	}

	
	public void setMobile(long mobileNumber) {
		this.mobile = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [email=" + email + ", name=" + name + ", mobileNumber=" + mobile + ", password=" + password
				+ "]";
	}
}



