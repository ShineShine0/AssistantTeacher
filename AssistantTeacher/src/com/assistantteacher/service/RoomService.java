package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.RoomDto;

public interface RoomService {

	long saveRoom(RoomDto roomDto);
	void updateRoom(RoomDto roomDto);
	boolean deleteRoom(long id);
	List<RoomDto> getRoomList();
	RoomDto getRoomById(long id);
}
