package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.OrderBookItemDto;

public interface OrderBookItemService {
	long saveOrderBookItem(OrderBookItemDto OrderBookItemDto);
	void updateOrderBookItem(OrderBookItemDto OrderBookItemDto);
	boolean deleteOrderBookItem(long id);
	List<OrderBookItemDto> getOrderBookItemList();
	OrderBookItemDto getOrderBookItemById(long id);
}
