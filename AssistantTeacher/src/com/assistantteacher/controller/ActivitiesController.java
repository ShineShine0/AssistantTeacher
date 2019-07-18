package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.ActivitiesDto;

import com.assistantteacher.service.ActivitiesService;
import com.assistantteacher.service.RoomService;
import com.assistantteacher.service.TeacherService;

@Controller
@RequestMapping(value="/activities")
public class ActivitiesController {
	/*@Autowired
	private ActivitiesService activitiesService;*/
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private RoomService roomService;
	@RequestMapping(value="/new_activities.htm")
	public String activitiesForm(Model model){
		model.addAttribute("teacherList", teacherService);
		model.addAttribute("roomList", roomService);
		model.addAttribute("activitiesDto", new ActivitiesDto());
		return"new_activities";
	}
	@RequestMapping(value="/activities_list.htm")
	public String activitiesList(Model model){
		//model.addAttribute("activitiesList", activitiesService.getActivitiesList());
		return"activities_list";
	}
}
