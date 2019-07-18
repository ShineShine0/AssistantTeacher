package com.assistantteacher.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.assistantteacher.dto.LessonPlanDto;



@Service
public interface LessonPlanService {
	long saveLessonPlan(LessonPlanDto lessonPlanDto);
	void updateLessonPlan(LessonPlanDto lessonPlanDto);
	boolean deleteLessonPlan(long id);
	List< LessonPlanDto> getLessonPlanList();
	LessonPlanDto getLessonPlanById(long id);
}
