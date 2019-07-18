package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.OrderBookItemDao;
import com.assistantteacher.dto.OrderBookItemDto;
import com.assistantteacher.entity.OrderBookItem;
@Service
public class OrderBookItemServiceImpl implements OrderBookItemService{
	@Autowired
	OrderBookItemDao orderBookItemDao;
	@Override
	public long saveOrderBookItem(OrderBookItemDto orderBookItemDto) {
		// TODO Auto-generated method stub
		return orderBookItemDao.saveOrderBookItem(convertOrderBookItemBean(orderBookItemDto));
	}
	private OrderBookItem convertOrderBookItemBean(OrderBookItemDto rdto){
		OrderBookItem r=new OrderBookItem();
		if(rdto.getId()!=0){
			r.setId(rdto.getId());
		}
		r.setQty(rdto.getQty());
		r.setAvailableStatus(rdto.isAvailableStatus());
		r.setAmount(rdto.getAmount());
		r.setTotalAmount(rdto.getTotalAmount());
		r.getBook().setId(rdto.getBookId());
		r.getBookOrder().setId(rdto.getBookOrderId());
		return r;
	}
	@Override
	public void updateOrderBookItem(OrderBookItemDto orderBookItemDto) {
		// TODO Auto-generated method stub
		orderBookItemDao.saveOrderBookItem(convertOrderBookItemBean(orderBookItemDto));
	}

	@Override
	public boolean deleteOrderBookItem(long id) {
		// TODO Auto-generated method stub
		return orderBookItemDao.deleteOrderBookItem(id);
	}

	@Override
	public List<OrderBookItemDto> getOrderBookItemList() {
		// TODO Auto-generated method stub
		return orderBookItemDao.getOrderBookItemList();
	}

	@Override
	public OrderBookItemDto getOrderBookItemById(long id) {
		// TODO Auto-generated method stub
		return orderBookItemDao.getOrderBookItemById(id);
	}

}
