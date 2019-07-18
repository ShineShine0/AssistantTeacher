package com.assistantteacher.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AttendanceResult implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAttendanceCount() {
		return attendanceCount;
	}

	public void setAttendanceCount(int attendanceCount) {
		this.attendanceCount = attendanceCount;
	}

	public double getAttendancePercent() {
		return attendancePercent;
	}

	public void setAttendancePercent(double attendancePercent) {
		this.attendancePercent = attendancePercent;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	private int attendanceCount;
	private double attendancePercent;
	
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student=new Student();
	
	@OneToOne
	@JoinColumn(name="admin_id")
	private Admin admin=new Admin();

}
