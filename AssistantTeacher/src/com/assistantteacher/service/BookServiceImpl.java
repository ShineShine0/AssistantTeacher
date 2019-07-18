package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.BookDao;
import com.assistantteacher.dto.BookDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Book;
import com.assistantteacher.entity.Room;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookDao bookDao;
	@Override
	
	public long saveBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		return bookDao.saveBook(convertBookBean(bookDto));
	}
	private Book convertBookBean(BookDto rdto){
		Book r=new Book();
		if(rdto.getId()!=0){
			r.setId(rdto.getId());
		}
		r.setName((rdto.getName()));
		r.setPrice(rdto.getPrice());
		r.setAuthor(rdto.getAuthor());
		r.setIsbn(rdto.getIsbn());
		r.setEdition(rdto.getEdition());
		r.getYear().setId(rdto.getYearId());
		return r;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		bookDao.saveBook(convertBookBean(bookDto));
	}

	@Override
	public boolean deleteBook(long id) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(id);
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return bookDao.getBookList();
	}

	@Override
	public BookDto getBookById(long id) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(id);
		}

}
