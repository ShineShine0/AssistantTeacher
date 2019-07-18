package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.BookOrderDto;
public interface BookOrderService {
	long saveBookOrder(BookOrderDto bookOrderDto);
	void updateBookOrder(BookOrderDto bookOrderDto);
	boolean deleteBookOrder(long id);
	List<BookOrderDto> getBookOrderList();
	BookOrderDto getBookOrderById(long id);

}
