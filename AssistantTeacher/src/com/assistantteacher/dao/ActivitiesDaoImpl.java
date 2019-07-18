package com.assistantteacher.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;

import com.assistantteacher.dto.ActivitiesDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Activities;
import com.assistantteacher.entity.Room;

public class ActivitiesDaoImpl extends GenericDaoImpl<Long, Activities>implements ActivitiesDao{

	@Override
	public long saveActivities(Activities activities) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(activities);
	}

	@Override
	public void updateActivities(Activities activities) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(activities);
	}

	@Override
	public boolean deleteActivities(long id) {
		// TODO Auto-generated method stub
		try{
			Activities stu=(Activities)getCurrentSession().get(Activities.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public List<ActivitiesDto> getActivitiesList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("room", "r",JoinType.LEFT_OUTER_JOIN)
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("path"), "path")
				.add(Projections.property("title"), "title")
				.add(Projections.property("description"), "description")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				.add(Projections.property("r.id"), "roomId")
				.add(Projections.property("r.name"), "roomName")
				);
		c.setResultTransformer(Transformers.aliasToBean(ActivitiesDto.class));
		return c.list();
	}

	@Override
	public ActivitiesDto getActivitiesById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("room", "r",JoinType.LEFT_OUTER_JOIN)
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("path"), "path")
				.add(Projections.property("title"), "title")
				.add(Projections.property("description"), "description")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				.add(Projections.property("r.id"), "roomId")
				.add(Projections.property("r.name"), "roomName")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(ActivitiesDto.class));
		return (ActivitiesDto)c.uniqueResult();
	}
	
	}


