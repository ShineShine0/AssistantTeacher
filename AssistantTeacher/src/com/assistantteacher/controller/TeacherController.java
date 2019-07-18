package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.TeacherDto;
import com.assistantteacher.service.TeacherService;

@Controller
@RequestMapping(value="/teacher")
public class TeacherController {
@Autowired
	TeacherService teacherService;
	@RequestMapping(value="/teacher_list.htm")
	public String index(Model model){
		model.addAttribute("teacherList", teacherService.getTeacherList());
		return "teacher_list";
	}
	@RequestMapping(value="/new_teacher.htm")
	public String createRoom(Model model){
		
		model.addAttribute("teacherDto", new TeacherDto());
		return "new_teacher";
	}
}
