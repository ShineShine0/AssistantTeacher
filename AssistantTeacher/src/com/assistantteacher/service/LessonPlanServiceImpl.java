package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.LessonPlanDao;
import com.assistantteacher.dto.LessonPlanDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.LessonPlan;
import com.assistantteacher.entity.Room;

@Service
public class LessonPlanServiceImpl implements LessonPlanService {
@Autowired
private LessonPlanDao lessonPlanDao;
	@Override
	public long saveLessonPlan(LessonPlanDto lessonPlanDto) {
		// TODO Auto-generated method stub
		return lessonPlanDao.saveLessonPlan(convertLessonPlanBean(lessonPlanDto));
	}
	private LessonPlan convertLessonPlanBean(LessonPlanDto rdto){
		LessonPlan r=new LessonPlan();
		if(rdto.getId()!=0){
			r.setId(rdto.getId());
		}
		r.setPostDate(rdto.getPostDate());
		r.setSysDate(rdto.getSysDate());
		r.setTitle(rdto.getTitle());
		r.setDescription(rdto.getDescription());
		r.getTeacher().setId(rdto.getTeacherId());
		
		return r;
	}

	@Override
	public void updateLessonPlan(LessonPlanDto lessonPlanDto) {
		// TODO Auto-generated method stub
		lessonPlanDao.saveLessonPlan(convertLessonPlanBean(lessonPlanDto));
	}

	@Override
	public boolean deleteLessonPlan(long id) {
		// TODO Auto-generated method stub
		return lessonPlanDao.deleteLessonPlan(id);
	}

	@Override
	public List<LessonPlanDto> getLessonPlanList() {
		// TODO Auto-generated method stub
		return lessonPlanDao.getLessonPlanList();
	}

	@Override
	public LessonPlanDto getLessonPlanById(long id) {
		// TODO Auto-generated method stub
		return lessonPlanDao.getLessonPlanById(id);
	}
	
}
