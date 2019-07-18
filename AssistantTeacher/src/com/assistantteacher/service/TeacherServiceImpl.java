package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.TeacherDao;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.dto.TeacherDto;
import com.assistantteacher.entity.Room;
import com.assistantteacher.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherDao teacherDao;

	@Override
	public long saveTeacher(TeacherDto teacherDto) {
		// TODO Auto-generated method stub
		return teacherDao.saveTeacher(convertTeacherBean(teacherDto));
	}
	
	private Teacher convertTeacherBean(TeacherDto  tdto){
		Teacher r=new Teacher();
		if( tdto.getId()!=0){
			r.setId( tdto.getId());
		}
		r.setName(  tdto.getName());
		r.setEmail(  tdto.getEmail());
		r.setDepartment(  tdto.getDepartment());
		r.setRole(  tdto.getRole());
		r.setPhno(  tdto.getPhno());
		return r;
	}

	@Override
	public void updateTeacher(TeacherDto tdto) {
		// TODO Auto-generated method stub
		teacherDao.saveTeacher(convertTeacherBean(tdto));
	}

	@Override
	public boolean deleteTeacher(long id) {
		// TODO Auto-generated method stub
		return teacherDao.deleteTeacher(id);
	}

	@Override
	public List<TeacherDto> getTeacherList() {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherList();
	}

	@Override
	public TeacherDto getTeacherById(long id) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherById(id);
	}

	
}
