package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.OrderBookItemDto;
import com.assistantteacher.entity.OrderBookItem;
public interface OrderBookItemDao {
	long saveOrderBookItem(OrderBookItem orderBookItem);
	void updateOrderBookItem(OrderBookItem orderBookItem);
	boolean deleteOrderBookItem(long id);
	List<OrderBookItemDto> getOrderBookItemList();
	OrderBookItemDto getOrderBookItemById(long id);
}
