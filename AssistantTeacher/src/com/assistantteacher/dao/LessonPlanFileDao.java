package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.LessonPlanFileDto;
import com.assistantteacher.entity.LessonPlanFile;



public interface LessonPlanFileDao {
	long saveLessonPlanFile(LessonPlanFile lessonPlanFile);
	void updateLessonPlanFile(LessonPlanFile lessonPlanFile);
	boolean deleteLessonPlanFile(long id);
	List<LessonPlanFileDto> getLessonPlanFileList();
	LessonPlanFileDto getLessonPlanFileById(long id);

}
