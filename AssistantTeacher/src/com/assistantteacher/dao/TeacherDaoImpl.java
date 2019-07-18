package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.dto.TeacherDto;
import com.assistantteacher.entity.Room;
import com.assistantteacher.entity.Teacher;
@Repository
@Transactional
public class TeacherDaoImpl  extends GenericDaoImpl<Long,Teacher>implements TeacherDao{

	@Override
	public long saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(teacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(teacher);
	}

	@Override
	public boolean deleteTeacher(long id) {
		// TODO Auto-generated method stub
		try{
			Teacher tea=(Teacher)getCurrentSession().get(Teacher.class,id);
			getCurrentSession().delete(tea);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	
	}

	@Override
	public List<TeacherDto> getTeacherList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Teacher.class);
				
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("roomName"), "roomName")
				.add(Projections.property("qty"), "qty"));
			
		c.setResultTransformer(Transformers.aliasToBean(RoomDto.class));
		return c.list();
		
	}

	@Override
	public TeacherDto getTeacherById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Teacher.class);
			
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("roomName"), "roomName")
				.add(Projections.property("qty"), "qty"));
				
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(TeacherDto.class));
		return (TeacherDto)c.uniqueResult();
	}
	
	}

