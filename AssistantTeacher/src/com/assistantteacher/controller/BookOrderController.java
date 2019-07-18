package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.BookOrderDto;
import com.assistantteacher.service.AdminService;
import com.assistantteacher.service.BookOrderService;
import com.assistantteacher.service.StudentService;
@Controller
@RequestMapping(value="/bookOrder")
public class BookOrderController {
		@Autowired
		 BookOrderService  bookOrderService;
		@Autowired
		StudentService studentService;
		@Autowired
		AdminService adminService;
		
		@RequestMapping(value="/bookOrder_list.htm")
		public String index(Model model){
			model.addAttribute("bookOrderList", bookOrderService.getBookOrderList());
			return "bookOrder_list";
		}
		@RequestMapping(value="/new_ bookOrder.htm")
		public String createRoom(Model model){
			model.addAttribute("studentList",studentService);
			model.addAttribute("adminList", adminService);
			model.addAttribute("bookOrderDto", new  BookOrderDto());
			return "new_bookOrder";
		}
	
}
