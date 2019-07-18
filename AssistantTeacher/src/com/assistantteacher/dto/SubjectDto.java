package com.assistantteacher.dto;

import java.io.Serializable;

public class SubjectDto implements Serializable {
	private long id;
	private String subjectName;
	private long yearId;
	private long teacherId;
	private long majorId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public long getYearId() {
		return yearId;
	}
	public void setYearId(long yearId) {
		this.yearId = yearId;
	}
	public long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}
	public long getMajorId() {
		return majorId;
	}
	public void setMajorId(long majorId) {
		this.majorId = majorId;
	}
	

}
