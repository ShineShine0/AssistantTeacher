package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.LessonPlanFileDao;
import com.assistantteacher.dto.LessonPlanFileDto;
import com.assistantteacher.entity.LessonPlanFile;

@Service
public class LessonPlanFileServiceImpl implements LessonPlanFileService{
	@Autowired
	 LessonPlanFileDao  lessonPlanFileDao;
	@Override
	public long saveLessonPlanFile(LessonPlanFileDto lessonPlanFileDto) {
		// TODO Auto-generated method stub
		return lessonPlanFileDao.saveLessonPlanFile(convertLessonPlanFileBean(lessonPlanFileDto));
	}
	private LessonPlanFile convertLessonPlanFileBean(LessonPlanFileDto rdto){
		LessonPlanFile r=new LessonPlanFile();
		if(rdto.getId()!=0){
			r.setId(rdto.getId());
		}
		r.setPath(rdto.getPath());
		r.setType(rdto.getType());
		r.getLessonPlan().setId(rdto.getLessonPlanId());
		return r;
	}
	@Override
	public void updateLessonPlanFile(LessonPlanFileDto lessonPlanFileDto) {
		// TODO Auto-generated method stub
		 lessonPlanFileDao.saveLessonPlanFile(convertLessonPlanFileBean(lessonPlanFileDto));
	}

	@Override
	public boolean deleteLessonPlanFile(long id) {
		// TODO Auto-generated method stub
		return lessonPlanFileDao.deleteLessonPlanFile(id);
	}

	@Override
	public List<LessonPlanFileDto> getLessonPlanFileList() {
		// TODO Auto-generated method stub
		return lessonPlanFileDao.getLessonPlanFileList();
	}

	@Override
	public LessonPlanFileDto getLessonPlanFileById(long id) {
		// TODO Auto-generated method stub
		return lessonPlanFileDao.getLessonPlanFileById(id);
	}

}
