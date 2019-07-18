package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.BookOrderDao;
import com.assistantteacher.dto.BookOrderDto;

import com.assistantteacher.entity.BookOrder;

@Service
public class BookOrderServiceImpl implements BookOrderService{
	@Autowired
	BookOrderDao bookOrderDao;
	@Override
	public long saveBookOrder(BookOrderDto bookOrderDto) {
		// TODO Auto-generated method stub
		return bookOrderDao.saveBookOrder(convertBookOrderBean(bookOrderDto));
	}
	private BookOrder convertBookOrderBean(BookOrderDto rdto){
		BookOrder r=new BookOrder();
		if(rdto.getId()!=0){
			r.setId(rdto.getId());
		}
		r.setPostDate(rdto.getPostDate());
		r.setCount(rdto.getCount());
		r.setTotalAmount(rdto.getTotalAmount());
		r.setInviceNo(rdto.getInviceNo());
		r.setStudentResponse(rdto.isStudentResponse());
		r.getStudent().setId(rdto.getStudentId());
		r.getAdmin().setId(rdto.getAdminId());
		return r;
	}
	@Override
	public void updateBookOrder(BookOrderDto bookOrderDto) {
		// TODO Auto-generated method stub
		bookOrderDao.saveBookOrder(convertBookOrderBean(bookOrderDto));
	}

	@Override
	public boolean deleteBookOrder(long id) {
		// TODO Auto-generated method stub
		return  bookOrderDao.deleteBookOrder(id);
	}

	@Override
	public List<BookOrderDto> getBookOrderList() {
		// TODO Auto-generated method stub
		return bookOrderDao.getBookOrderList();
	}

	@Override
	public BookOrderDto getBookOrderById(long id) {
		// TODO Auto-generated method stub
		return bookOrderDao.getBookOrderById(id);
	}

}
