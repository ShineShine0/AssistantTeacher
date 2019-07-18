package com.assistantteacher.dto;

import java.io.Serializable;

public class RoomDto implements Serializable{

	
		public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public long getYearId() {
		return yearId;
	}
	public void setYearId(long yearId) {
		this.yearId = yearId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		private long id;
		
		
		private String roomName;
		
		private int qty;
		private long teacherId;
		private String teacherName;
		private long yearId;
		private String name;
		
		
		
		

}
