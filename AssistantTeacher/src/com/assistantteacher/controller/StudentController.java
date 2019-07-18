package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="/student_list.htm")
	public String index(Model model){
		model.addAttribute("studentList", studentService.getStudentList());
		return "student_list";
	}
	@RequestMapping(value="/new_student.htm")
	public String createRoom(Model model){

		model.addAttribute("studentDto", new RoomDto());
		return "new_student";
	}

}
