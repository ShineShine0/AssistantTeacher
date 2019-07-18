package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.LessonPlanDto;
import com.assistantteacher.entity.LessonPlan;


public interface LessonPlanDao {
	long saveLessonPlan(LessonPlan lessonPlan);
	void updateLessonPlan(LessonPlan lessonPlan);
	boolean deleteLessonPlan(long id);
	List<LessonPlanDto> getLessonPlanList();
	LessonPlanDto getLessonPlanById(long id);

}
