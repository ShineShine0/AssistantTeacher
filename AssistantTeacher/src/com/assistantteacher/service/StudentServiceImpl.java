package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.StudentDao;

import com.assistantteacher.dto.StudentDto;

import com.assistantteacher.entity.Student;
@Service
public class StudentServiceImpl  implements StudentService{
@Autowired
private StudentDao sutdentDao;
	@Override
	public long saveStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		return sutdentDao.saveStudent(convertStudentBean(studentDto));
	}
	

	private Student convertStudentBean(StudentDto sdto){
		 Student s=new Student ();
		if(sdto.getId()!=0){
			s.setId(sdto.getId());
		}
		s.setName(sdto.getName());
		s.setRollNo(sdto.getRollNo());
		s.setEmail(sdto.getEmail());
		s.setPassword(sdto.getPassword());
		s.setPhno(sdto.getPhno());
		s.setGender(sdto.getGender());
		return s;
	}
	
	@Override
	public void updateStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		sutdentDao.saveStudent(convertStudentBean(studentDto));
	}

	@Override
	public boolean deleteStudent(long id) {
		// TODO Auto-generated method stub
		return sutdentDao.deleteStudent(id);
	}

	@Override
	public List<StudentDto> getStudentList() {
		// TODO Auto-generated method stub
		return sutdentDao.getStudentList();
	}

	@Override
	public StudentDto getStudentById(long id) {
		// TODO Auto-generated method stub
		return sutdentDao.getStudentById(id);
	}

}
