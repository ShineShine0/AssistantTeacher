package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.AttendanceResultDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.service.AdminService;
import com.assistantteacher.service.AttendanceResultService;
import com.assistantteacher.service.StudentService;

@Controller
@RequestMapping(value="attendanceResult")
public class AttendanceResultController {
	@Autowired
	private AttendanceResultService attendanceResultService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/new_attendanceResult.htm")
	public String newAttendance(Model model){
		model.addAttribute("studentList", studentService);
		model.addAttribute("adminList", adminService);
		model.addAttribute("attendanceResultDto", new AttendanceResultDto());
		return"new_attendanceResult";
	}
	@RequestMapping(value="/attendanceResult_list.htm")
	public String attendanceResultList(Model model){
		model.addAttribute("attendanceResultList", attendanceResultService.getAttendanceResultList());
		return"attendanceResult_list";
	}
}
