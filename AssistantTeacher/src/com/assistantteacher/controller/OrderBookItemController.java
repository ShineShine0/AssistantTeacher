package com.assistantteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assistantteacher.dto.OrderBookItemDto;

import com.assistantteacher.service.BookOrderService;
import com.assistantteacher.service.BookService;
import com.assistantteacher.service.OrderBookItemService;							
@Controller
@RequestMapping(value="/orderBookItem")
public class OrderBookItemController {

		@Autowired
		OrderBookItemService orderBookItemService;
		@Autowired
		BookService bookService;
		@Autowired
		BookOrderService bookOrderService;
		
		@RequestMapping(value="/orderBookItem_list.htm")
		public String index(Model model){
			model.addAttribute("orderBookItemList", orderBookItemService.getOrderBookItemList());
			return "orderBookItem_list";
		}
		@RequestMapping(value="/new_orderBookItem.htm")
		public String createRoom(Model model){
			model.addAttribute("bookList", bookService);
			model.addAttribute("bookOrderList", bookOrderService);
			model.addAttribute("orderBookItemDto", new OrderBookItemDto());
			return "new_orderBookItem";
		}
}
