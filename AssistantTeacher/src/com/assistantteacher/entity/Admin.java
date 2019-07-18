package com.assistantteacher.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Admin")
public class Admin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3008009785019520550L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Long id;
	@Column(name="uName")
	private String uName;
	@Column(name="uPassword")
	private String uPassword;
	@Column(name="Name")
	private String name;
	@Column(name="NRC")
	private String nrc;
	@Column(name="Address")
	private String address;
	@Column(name="DOB")
	private String dob;
	@Column(name="MobileNumber")
	private String mobileNumber;
	@Column(name="Email")
	private String email;
	@Column(name="Status")
	private String status;
	@ManyToOne
	@JoinColumn(name="RoleId")
	private AdminRole userRole=new AdminRole();
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AdminRole getUserRole() {
		return userRole;
	}
	public void setUserRole(AdminRole userRole) {
		this.userRole = userRole;
	}
	
	
	
	
}
