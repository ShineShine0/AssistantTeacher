package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.MajorDto;

import com.assistantteacher.service.MajorService;

@Controller
@RequestMapping(value="/major")
public class MajorController {
	@Autowired 
	private MajorService majorService;
	@RequestMapping(value="/new_major.htm")
	public String createMajor(Model model){
		
		model.addAttribute("majorDto", new MajorDto());
		return"new_major";
	}
	@RequestMapping(value="/major_list.htm")
	public String majorList(Model model){
		model.addAttribute("majorList",majorService.getMajorList());
		return"major_list";
	}
}
