package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.service.RoomService;
import com.assistantteacher.service.TeacherService;
import com.assistantteacher.service.YearServices;

@Controller
@RequestMapping(value="/room")
public class RoomController {

	@Autowired
	RoomService roomService;
	@Autowired
	YearServices yearServices;
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(value="/room_list.htm")
	public String index(Model model){
		model.addAttribute("roomList", roomService.getRoomList());
		return "room_list";
	}
	@RequestMapping(value="/new_room.htm")
	public String createRoom(Model model){
		model.addAttribute("teacherList", teacherService);
		model.addAttribute("yearList", yearServices);
		model.addAttribute("roomDto", new RoomDto());
		return "new_room";
	}
}
