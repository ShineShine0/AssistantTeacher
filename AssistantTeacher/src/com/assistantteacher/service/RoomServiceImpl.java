package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.RoomDao;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Room;
@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	RoomDao roomDao;
	@Override
	public long saveRoom(RoomDto roomDto) {
		// TODO Auto-generated method stub
		return roomDao.saveRoom(convertRoomBean(roomDto));
	}

	private Room convertRoomBean(RoomDto rdto){
		Room r=new Room();
		if(rdto.getId()!=0){
			r.setId(rdto.getId());
		}
		r.setRoomName(rdto.getRoomName());
		r.setQty(rdto.getQty());
		r.getTeacher().setId(rdto.getTeacherId());
		r.getYear().setId(rdto.getYearId());
		return r;
	}
	@Override
	public void updateRoom(RoomDto roomDto) {
		// TODO Auto-generated method stub
		roomDao.saveRoom(convertRoomBean(roomDto));
	}

	@Override
	public boolean deleteRoom(long id) {
		// TODO Auto-generated method stub
		return roomDao.deleteRoom(id);
	}

	@Override
	public List<RoomDto> getRoomList() {
		// TODO Auto-generated method stub
		return roomDao.getRoomList();
	}

	@Override
	public RoomDto getRoomById(long id) {
		// TODO Auto-generated method stub
		return roomDao.getRoomById(id);
	}

}
