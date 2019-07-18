package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.MajorDao;
import com.assistantteacher.dto.MajorDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Major;
import com.assistantteacher.entity.Room;

@Service
public class MajorServiceImpl implements MajorService {

	@Autowired
	MajorDao majorDao;
	@Override
	public long saveMajor(MajorDto majorDto) {
		// TODO Auto-generated method stub
		return majorDao.saveMajor(convertMajorBean(majorDto));
	}
	private Major convertMajorBean(MajorDto rdto){
		Major r=new Major();
		if(rdto.getId()!=0){
			r.setId(rdto.getId());
		}
		r.setName(rdto.getLongName());
		r.setLongName(rdto.getLongName());
		
		return r;
	}

	@Override
	public void updateMajor(MajorDto majorDto) {
		// TODO Auto-generated method stub
		majorDao.saveMajor(convertMajorBean(majorDto));

	}

	@Override
	public boolean deleteMajor(long id) {
		// TODO Auto-generated method stub
		return majorDao.deleteMajor(id);
	}

	@Override
	public MajorDto getMajorById(long id) {
		// TODO Auto-generated method stub
		return majorDao.getMajorById(id);
	}

	@Override
	public List<MajorDto> getMajorList() {
		// TODO Auto-generated method stub
		return majorDao.getMajorList();
	}

	
	
	
}
