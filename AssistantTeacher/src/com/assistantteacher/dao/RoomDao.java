package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Room;

public interface RoomDao {

	long saveRoom(Room room);
	void updateRoom(Room room);
	boolean deleteRoom(long id);
	List<RoomDto> getRoomList();
	RoomDto getRoomById(long id);
}
