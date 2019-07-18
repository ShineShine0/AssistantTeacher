package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.SubjectDto;
import com.assistantteacher.entity.Subject;



public interface SubjectDao {

	long saveSubject(Subject subject);
	void updateSubject(Subject subject);
	boolean deleteSubject(long id);
	List<SubjectDto> getSubjectList();
	SubjectDto getSubjectById(long id);

}
