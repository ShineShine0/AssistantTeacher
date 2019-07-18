package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.LessonPlanFileDto;
import com.assistantteacher.service.LessonPlanFileService;
import com.assistantteacher.service.LessonPlanService;

@Controller
@RequestMapping(value="/lessonPlanFile")
public class LessonPlanFileController {

		@Autowired
		LessonPlanService lessonPlanService;
		@Autowired
		LessonPlanFileService lessonPlanFileService;
		
		@RequestMapping(value="/lessonPlanFile_list.htm")
		public String index(Model model){
			model.addAttribute("lessonPlanFileList", lessonPlanFileService.getLessonPlanFileList());
			return "lessonPlanFile_list";
		}
		@RequestMapping(value="/new_lessonPlanFile.htm")
		public String createRoom(Model model){
			model.addAttribute("lessonPlanList",lessonPlanService);
			model.addAttribute("lessonPlanFileDto", new LessonPlanFileDto());
			return "new_lessonPlanFile";
	}
}
