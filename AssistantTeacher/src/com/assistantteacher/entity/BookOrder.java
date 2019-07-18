package com.assistantteacher.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BookOrder implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private Date postDate;
	private int count;
	private double totalAmount;
	private String inviceNo;
	private boolean studentResponse;
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
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@OneToOne
	@JoinColumn(name="admin_id")
	private Admin admin=new Admin();
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student=new Student();

}
