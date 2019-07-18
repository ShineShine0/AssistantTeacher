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
import com.assistantteacher.dto.SubjectDto;
import com.assistantteacher.entity.Room;
import com.assistantteacher.entity.Subject;
@Repository
@Transactional
public class SubjectDaoImpl extends GenericDaoImpl<Long, Subject>implements SubjectDao{

	@Override
	public long saveSubject(Subject subject) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(subject);
	}

	@Override
	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(subject);
	}

	@Override
	public boolean deleteSubject(long id) {
		// TODO Auto-generated method stub
		try{
			Subject sub=(Subject)getCurrentSession().get(Subject.class,id);
			getCurrentSession().delete(sub);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
	}

	@Override
	public List<SubjectDto> getSubjectList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Subject.class)
				.createAlias("major", "m",JoinType.LEFT_OUTER_JOIN)
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				.createAlias("year", "y",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("subjectName"), "subjectName")
				.add(Projections.property("m.name"), "majorName")
				.add(Projections.property("m.id"), "majorId")
				.add(Projections.property("y.name"), "yearName")
				.add(Projections.property("y.id"), "yearId")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				);
		c.setResultTransformer(Transformers.aliasToBean(RoomDto.class));
		return c.list();
	}
	

	@Override
	public SubjectDto getSubjectById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("year", "y",JoinType.LEFT_OUTER_JOIN)
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				.createAlias("major", "m",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("roomName"), "roomName")
				.add(Projections.property("m.name"), "majorName")
				.add(Projections.property("m.id"), "majorId")
				.add(Projections.property("y.name"), "yearName")
				.add(Projections.property("y.id"), "yearId")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(SubjectDto.class));
		return (SubjectDto)c.uniqueResult();
	}

	}


