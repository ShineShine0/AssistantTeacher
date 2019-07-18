package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.BookDto;
import com.assistantteacher.entity.Book;

public interface BookDao {
	long saveBook(Book book);
	void updateBook(Book book);
	boolean deleteBook(long id);
	List<BookDto> getBookList();
	BookDto getBookById(long id);
}
