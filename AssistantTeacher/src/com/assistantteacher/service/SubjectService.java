package com.assistantteacher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assistantteacher.dto.SubjectDto;


@Service
public interface SubjectService {
	long saveSubject(SubjectDto subjectDto);
	void updateSubject(SubjectDto subjectDto);
	boolean deleteSubject(long id);
	List<SubjectDto> getSubjectList();
	SubjectDto getSubjectById(long id);
}
