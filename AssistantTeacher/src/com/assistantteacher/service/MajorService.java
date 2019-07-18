package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.MajorDto;
import com.assistantteacher.entity.Major;

public interface MajorService {

	long saveMajor(MajorDto majorDto);
	void updateMajor(MajorDto majorDto);
	boolean deleteMajor(long id);
	MajorDto getMajorById(long id);
	List<MajorDto> getMajorList();
}
