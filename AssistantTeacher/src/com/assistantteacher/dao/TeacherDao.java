package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.dto.TeacherDto;
import com.assistantteacher.entity.Room;
import com.assistantteacher.entity.Teacher;

public interface TeacherDao {
	
	long saveTeacher(Teacher teacher);
	
	void updateTeacher(Teacher teacher);
	
	boolean deleteTeacher(long id);
	List<TeacherDto> getTeacherList();
	TeacherDto getTeacherById(long id);

}
