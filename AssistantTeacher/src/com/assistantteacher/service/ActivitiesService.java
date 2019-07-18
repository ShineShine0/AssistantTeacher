package com.assistantteacher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assistantteacher.dto.ActivitiesDto;



@Service
public interface ActivitiesService {
	long saveActivities(ActivitiesDto roomDto);
	void updateActivities(ActivitiesDto roomDto);
	boolean deleteActivities(long id);
	List<ActivitiesDto> getActivitiesList();
	ActivitiesDto getActivitiesById(long id);
}
