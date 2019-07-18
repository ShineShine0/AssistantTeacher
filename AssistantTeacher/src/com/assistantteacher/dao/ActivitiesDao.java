package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.ActivitiesDto;
import com.assistantteacher.entity.Activities;



public interface ActivitiesDao {
	long saveActivities(Activities activities);
	void updateActivities(Activities activities);
	boolean deleteActivities(long id);
	List<ActivitiesDto> getActivitiesList();
	ActivitiesDto getActivitiesById(long id);


}
