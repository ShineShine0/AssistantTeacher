package com.assistantteacher.dto;

import java.io.Serializable;
import java.util.Date;

public class BookOrderDto implements Serializable{
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getInviceNo() {
		return inviceNo;
	}
	public void setInviceNo(String inviceNo) {
		this.inviceNo = inviceNo;
	}
	public boolean isStudentResponse() {
		return studentResponse;
	}
	public void setStudentResponse(boolean studentResponse) {
		this.studentResponse = studentResponse;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	private Date postDate;
	private int count;
	private double totalAmount;
	private String inviceNo;
	private boolean studentResponse;
	
	private Long studentId;
	private String studentName;
	
	private Long adminId;
	private String adminName;
	

}

