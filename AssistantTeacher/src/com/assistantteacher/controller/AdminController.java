package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.service.AdminService;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@RequestMapping(value="/new_admin.htm")
	public String registerAdmin(Model model){
		return"new_admin";
	}
	@RequestMapping(value="admin_list.htm")
	public String adminList(Model model){
		return"admin_list";
	}
	

}
