package com.assistantteacher.dto;

import java.io.Serializable;

public class AttendanceResultDto implements Serializable{
	private long id;
	private int attendanceCount;
	private double attendancePercent;
	private long studentId;
	private long adminId;
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
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
}
