package com.assistantteacher.controller;
import com.assistantteacher.dto.YearDTO;
import com.assistantteacher.entity.*;
import com.assistantteacher.service.YearServices;

import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YearController {
    
	@Autowired
	private YearServices yearServices;
	
	
	@RequestMapping(value="/createyear.htm")
	public String Year(Model model) {
		model.addAttribute("year", new YearDTO());
		return "year";
	}
	
	@RequestMapping(value="/createyear.htm",method=RequestMethod.POST)
	public String saveYear(@Valid @ModelAttribute(value="year")YearDTO y,Model model,BindingResult result) {
		if(!result.hasErrors()) {
			yearServices.saveYear(y);
			model.addAttribute("year", new YearDTO());
		}
		
		return "year";
	}
	
	
	@RequestMapping(value="/retrieveyear")
	public String retrieveYear(Model model) {		
		
		model.addAttribute("retrieveyear",yearServices.retrieve());
		return "yearList";
		
	}
	@RequestMapping(value="/updateYear.htm/{id}",method=RequestMethod.GET)
	public String updateYear(@PathVariable(value="id") long id,Model model) {
		YearDTO y=yearServices.getYearById(id);
		model.addAttribute("year",y);
		return "editYear";
	}
	@RequestMapping(value="/updateYear.htm",method=RequestMethod.POST)
	public String updateYear(@Valid @ModelAttribute(value="year") YearDTO year,Model model,BindingResult result) {
		if(!result.hasErrors()) {
			try {
				yearServices.update(year);
				return "redirect:/retrieveyear";
			}catch (Exception e) {
				// TODO: handle exception
				model.addAttribute("error", e.getMessage());
				return "editYear";
			}
		}else {
			model.addAttribute("error", result.getAllErrors());
			return "editYear";
		}
		
		
	}
	
	@RequestMapping(value="/deleteyear.htm/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable(value="id") long id) {
		
		
		yearServices.delete(id);		
		return "redirect:/retrieveyear";
		
	}
	
	
}
