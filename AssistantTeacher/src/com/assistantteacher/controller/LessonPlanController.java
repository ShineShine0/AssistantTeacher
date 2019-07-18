package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.BookDto;
import com.assistantteacher.dto.LessonPlanDto;
import com.assistantteacher.service.LessonPlanService;
import com.assistantteacher.service.TeacherService;

@Controller
public class LessonPlanController {

	@Autowired
	private TeacherService teacherService;
	@Autowired
	private LessonPlanService lessonPlanService;
	
	@RequestMapping(value="/lessonPlanList.htm ")
	public String lessonPlan(Model model){
		model.addAttribute("lessonPlanList", lessonPlanService.getLessonPlanList());
		return "lessonPlan_list";
	}
	@RequestMapping(value="/lessonPlan.htm")
	public String createPlan(Model model){
		//model.addAttribute("teacherList", teacherService.);
		model.addAttribute("lessonPlanDto", new LessonPlanDto());
		return "new_LessonPlan";
	}
}
