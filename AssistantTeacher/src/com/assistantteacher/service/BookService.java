package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.BookDto;

public interface BookService {
	long saveBook(BookDto bookDto);
	void updateBook(BookDto bookDto);
	boolean deleteBook(long id);
	List<BookDto> getBookList();
	BookDto getBookById(long id);
}
