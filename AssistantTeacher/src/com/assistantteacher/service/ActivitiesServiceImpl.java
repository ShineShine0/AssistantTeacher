package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.assistantteacher.dao.ActivitiesDao;
import com.assistantteacher.dto.ActivitiesDto;

import com.assistantteacher.entity.Activities;
import com.assistantteacher.entity.Room;


public class ActivitiesServiceImpl implements ActivitiesService {
@Autowired
private ActivitiesDao activitiesDao;

@Override
public long saveActivities(ActivitiesDto activitiesDto) {
	// TODO Auto-generated method stub
	return activitiesDao.saveActivities(convertActivitiesBean(activitiesDto));

}

private Activities convertActivitiesBean(ActivitiesDto rdto){
	Activities r=new Activities();
	if(rdto.getId()!=0){
		r.setId(rdto.getId());
	}
	r.setPath(rdto.getPath());
	r.setDescription(rdto.getDescription());
	r.setTitle(rdto.getTitle());
	r.getTeacher().setId(rdto.getTeacherId());
	((Room) r.getRoom()).setId(rdto.getRoomId());
	return r;
}

@Override
public void updateActivities(ActivitiesDto activitiesDto) {
	// TODO Auto-generated method stub
	activitiesDao.saveActivities(convertActivitiesBean(activitiesDto));
}

@Override
public boolean deleteActivities(long id) {
	// TODO Auto-generated method stub
	return activitiesDao.deleteActivities(id);
}

@Override
public List<ActivitiesDto> getActivitiesList() {
	// TODO Auto-generated method stub
	return activitiesDao.getActivitiesList();
}

@Override
public ActivitiesDto getActivitiesById(long id) {
	// TODO Auto-generated method stub
	return activitiesDao.getActivitiesById(id);
}
	
}
