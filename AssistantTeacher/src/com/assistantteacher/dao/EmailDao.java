package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.entity.Student;



public interface EmailDao {
	public List<Student> getStudents();
    
	public List searchStudent(String name);
	public void deleteStudent(int id);


}
