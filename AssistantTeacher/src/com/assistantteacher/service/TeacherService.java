package com.assistantteacher.service;

import java.util.List;


import com.assistantteacher.dto.TeacherDto;


public interface TeacherService {

	
long saveTeacher(TeacherDto teacherDto);
void updateTeacher(TeacherDto teacherDto);
boolean deleteTeacher(long id);
List<TeacherDto> getTeacherList();
TeacherDto getTeacherById(long id);
}
