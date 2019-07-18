package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.BookDto;
import com.assistantteacher.service.BookService;
import com.assistantteacher.service.YearServices;
@Controller
@RequestMapping(value="/book")
public class BookController {
	

		@Autowired
		BookService bookService;
		@Autowired
		YearServices yearServices;
		
		@RequestMapping(value="/book_list.htm")
		public String index(Model model){
			model.addAttribute("bookList", bookService.getBookList());
			return "book_list";
		}
		@RequestMapping(value="/new_book.htm")
		public String createRoom(Model model){
			
			model.addAttribute("yearList", yearServices);
			model.addAttribute("bookDto", new BookDto());
			return "new_book";
		}

}

