package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.dto.SubjectDto;
import com.assistantteacher.service.MajorService;
import com.assistantteacher.service.SubjectService;
import com.assistantteacher.service.TeacherService;
import com.assistantteacher.service.YearServices;

@Controller
@RequestMapping(value="/subject")
public class SubjectController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private YearServices yearServices;
	@Autowired
	private MajorService majorService;
	@Autowired
	private SubjectService subjectService;
	@RequestMapping(value="/new_subject.htm")
	public String newSubject(Model model){
		model.addAttribute("teacherList", teacherService);
		model.addAttribute("yearList", yearServices);
		model.addAttribute("majorList", majorService);
		model.addAttribute("SubjectDto", new SubjectDto());
		return"new_subject";
	}
	@RequestMapping(value="/subject_list.htm")
	public String subjectList(Model model){
		model.addAttribute("majorList", majorService.getMajorList());
		model.addAttribute("yearList", yearServices.retrieve());
		model.addAttribute("teacherList", teacherService.getTeacherList());
		return"subject_list";
	}
	

}
