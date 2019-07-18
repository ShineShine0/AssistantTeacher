package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.StudentDto;
import com.assistantteacher.entity.Student;


public interface StudentDao {
	long saveStudent(Student  student);
	void updateStudent(Student student);
	boolean deleteStudent(long id);
	List<StudentDto> getStudentList();
	StudentDto getStudentById(long id);
}
