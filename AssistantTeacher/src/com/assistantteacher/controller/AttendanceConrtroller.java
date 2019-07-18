package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.service.AdminService;
import com.assistantteacher.service.AttendanceService;
import com.assistantteacher.service.StudentService;
import com.assistantteacher.service.SubjectService;
import com.assistantteacher.service.TeacherService;

@Controller
@RequestMapping(value="/attendance")
public class AttendanceConrtroller {
	@Autowired
	private AttendanceService attendanceService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private StudentService studentService;
	@Autowired 
	private AdminService adminService;
	

	@RequestMapping(value="/new_attendance")
	public String createAtendance(Model model){
		model.addAttribute("teacherList", teacherService);
		model.addAttribute("subjectList",subjectService);
		model.addAttribute("adminList",adminService);
		model.addAttribute("studentList",studentService);
		
		return"new_attendance";
	}
	@RequestMapping(value="/attendance_list")
	public String attendanceList(Model model){
		model.addAttribute("addendanceList",attendanceService.getAttendanceList());
		return"attendance_list";
	}
	

}
