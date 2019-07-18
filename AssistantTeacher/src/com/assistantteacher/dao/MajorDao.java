package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.MajorDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Major;
import com.assistantteacher.entity.Room;

public interface MajorDao {

	long saveMajor(Major major);
	void updateMajor(Major major);
	boolean deleteMajor(long id);
	List<MajorDto> getMajorList();
	MajorDto getMajorById(long id);
}
