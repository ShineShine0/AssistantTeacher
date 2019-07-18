package com.assistantteacher.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;

import com.assistantteacher.dto.LessonPlanFileDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.LessonPlanFile;
import com.assistantteacher.entity.Room;


public class LessonPlanFileDaoImpl extends GenericDaoImpl<Long, LessonPlanFile>implements LessonPlanFileDao{

	@Override
	public long saveLessonPlanFile(LessonPlanFile lessonPlanFile) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(lessonPlanFile);
	}

	@Override
	public void updateLessonPlanFile(LessonPlanFile lessonPlanFile) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(lessonPlanFile);
	}

	@Override
	public boolean deleteLessonPlanFile(long id) {
		// TODO Auto-generated method stub
		try{
			LessonPlanFile stu=(LessonPlanFile)getCurrentSession().get(LessonPlanFile.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public List<LessonPlanFileDto> getLessonPlanFileList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(LessonPlanFile.class)
				.createAlias("lessonPlan", "l",JoinType.LEFT_OUTER_JOIN)
				
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("path"), "path")
				.add(Projections.property("type"), "type")
				.add(Projections.property("lessonPlanId"), "lessonPlanId")
				
				);
		c.setResultTransformer(Transformers.aliasToBean(LessonPlanFileDto.class));
		return c.list();
	}

	@Override
	public LessonPlanFileDto getLessonPlanFileById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(LessonPlanFile.class)
				.createAlias("lessonPlan", "l",JoinType.LEFT_OUTER_JOIN)
				
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("path"), "path")
				.add(Projections.property("type"), "type")
				.add(Projections.property("lessonPlanId"), "lessonPlanId")
				
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(LessonPlanFileDto.class));
		return (LessonPlanFileDto)c.uniqueResult();
	}

	
	
}
