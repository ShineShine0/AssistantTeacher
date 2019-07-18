package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.LessonPlanFileDto;



public interface LessonPlanFileService {
	long saveLessonPlanFile(LessonPlanFileDto lessonPlanFileDto);
	void updateLessonPlanFile(LessonPlanFileDto lessonPlanFileDto);
	boolean deleteLessonPlanFile(long id);
	List<LessonPlanFileDto> getLessonPlanFileList();
	LessonPlanFileDto getLessonPlanFileById(long id);
}
