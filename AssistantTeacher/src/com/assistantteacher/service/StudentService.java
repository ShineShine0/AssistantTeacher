package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.StudentDto;

public interface StudentService {
	long saveStudent(StudentDto studentDto);
	void updateStudent(StudentDto studentDto);
	boolean deleteStudent(long id);
	List<StudentDto> getStudentList();
	StudentDto getStudentById(long id);
}
