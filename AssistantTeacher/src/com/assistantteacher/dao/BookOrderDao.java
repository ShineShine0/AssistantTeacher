package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.BookOrderDto;
import com.assistantteacher.entity.BookOrder;



public interface BookOrderDao {
	long saveBookOrder(BookOrder bookOrder);
	void updateBookOrder(BookOrder bookOrder);
	boolean deleteBookOrder(long id);
	List<BookOrderDto> getBookOrderList();
	BookOrderDto getBookOrderById(long id);
}
