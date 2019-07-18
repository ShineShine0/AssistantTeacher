package com.assistantteacher.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Subject")

public class Subject implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="subject_name")
	private String subjectName;
	
	@ManyToOne
	@JoinColumn(name="year_id")
	private Year year=new Year();
	
	
	@ManyToMany
	@JoinTable(
	  name = "subject_teacher", 
	  joinColumns = @JoinColumn(name = "subject_id"), 
	  inverseJoinColumns = @JoinColumn(name = "teacher_id"))
	private List<Teacher> teacherList=new ArrayList();
	
	@ManyToOne
	@JoinColumn(name="major_id")
	private Major major=new Major();
	
	
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public List<Teacher> getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}
	public void setId(long id) {
		
		this.id=id;
	}
	public long getId() {
		
		return id;
	}
	
	public void setSubjectName(String name) {
		
		this.subjectName=name;
	}
	public String getSubjectName() {
		
		return subjectName;
	}
	
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	
	

}
