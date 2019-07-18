package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.assistantteacher.dao.SubjectDao;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.dto.SubjectDto;
import com.assistantteacher.entity.Room;
import com.assistantteacher.entity.Subject;


public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectDao subjectDao;
	@Override
	public long saveSubject(SubjectDto subjectDto) {
		// TODO Auto-generated method stub
		return subjectDao.saveSubject(convertSubjectBean(subjectDto));
	}
	private Subject convertSubjectBean(SubjectDto sdto){
		Subject su=new Subject();
		if(sdto.getId()!=0){
			su.setId(sdto.getId());
		}
		su.setSubjectName(sdto.getSubjectName());
		//su.getTeacherList()
		su.getYear().setId(sdto.getYearId());
		su.getMajor().setId(sdto.getMajorId());
		return su;
	}

	@Override
	public void updateSubject(SubjectDto subjectDto) {
		// TODO Auto-generated method stub
		subjectDao.saveSubject(convertSubjectBean(subjectDto));
	}

	@Override
	public boolean deleteSubject(long id) {
		// TODO Auto-generated method stub
		return subjectDao.deleteSubject(id);
	}

	@Override
	public List<SubjectDto> getSubjectList() {
		// TODO Auto-generated method stub
		return subjectDao.getSubjectList();
	}

	@Override
	public SubjectDto getSubjectById(long id) {
		// TODO Auto-generated method stub
		return subjectDao.getSubjectById(id);
	}

}
