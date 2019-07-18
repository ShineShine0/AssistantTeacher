package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.LessonPlanDto;

import com.assistantteacher.entity.LessonPlan;

@Repository
@Transactional
public class LessonPlanDaoImpl extends GenericDaoImpl<Long, LessonPlan>implements LessonPlanDao{

	@Override
	public long saveLessonPlan(LessonPlan lessonPlan) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(lessonPlan);
	}

	@Override
	public void updateLessonPlan(LessonPlan lessonPlan) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(lessonPlan);
	}

	@Override
	public boolean deleteLessonPlan(long id) {
		// TODO Auto-generated method stub
		try{
			LessonPlan lessonplan=(LessonPlan)getCurrentSession().get(LessonPlan.class,id);
			getCurrentSession().delete(lessonplan);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public List<LessonPlanDto> getLessonPlanList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(LessonPlan.class)
				
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("postDate"), "postDate")
				.add(Projections.property("sysDate"), "sysDate")
				.add(Projections.property("title"), "title")
				.add(Projections.property("description"), "description")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				);
		c.setResultTransformer(Transformers.aliasToBean(LessonPlanDto.class));
		return c.list();
	}
	

	@Override
	public LessonPlanDto getLessonPlanById(long id) {
		// TODO Auto-generated method stub
Criteria c=getCurrentSession().createCriteria(LessonPlan.class)
				
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("postDate"), "postDate")
				.add(Projections.property("sysDate"), "sysDate")
				.add(Projections.property("title"), "title")
				.add(Projections.property("description"), "description")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				);
		c.setResultTransformer(Transformers.aliasToBean(LessonPlanDto.class));
	
		c.add(Restrictions.eq("id", id));

		return (LessonPlanDto)c.uniqueResult();
	}
	}

