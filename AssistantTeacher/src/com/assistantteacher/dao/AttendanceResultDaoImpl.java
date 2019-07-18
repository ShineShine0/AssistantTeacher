package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.AttendanceResultDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.AttendanceResult;
import com.assistantteacher.entity.Room;
@Repository
@Transactional
public class AttendanceResultDaoImpl extends GenericDaoImpl<Long, AttendanceResult>implements AttendanceResultDao{

	@Override
	public long saveAttendanceResult(AttendanceResult attendanceResult) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(attendanceResult);
	}

	@Override
	public void updateAttendanceResult(AttendanceResult attendanceResult) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(attendanceResult);
	}

	@Override
	public boolean deleteAttendanceResult(long id) {
		// TODO Auto-generated method stub
		try{
			AttendanceResult stu=(AttendanceResult)getCurrentSession().get(AttendanceResult.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public List<AttendanceResultDto> getAttendanceResultList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(AttendanceResult.class)
				.createAlias("student", "s",JoinType.LEFT_OUTER_JOIN)
				.createAlias("admin", "a",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("attendanceCount"), "attendanceCount")
				.add(Projections.property("attendancePercent"), "attendancePercent")
				.add(Projections.property("s.name"), "studentName")
				.add(Projections.property("s.id"), "studentId")
				.add(Projections.property("a.id"), "adminId")
				.add(Projections.property("a.name"), "adminName")
				);
		c.setResultTransformer(Transformers.aliasToBean(AttendanceResultDto.class));
		return c.list();
	}

	@Override
	public AttendanceResultDto getAttendanceResultById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(AttendanceResult.class)
				.createAlias("student", "s",JoinType.LEFT_OUTER_JOIN)
				.createAlias("admin", "a",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("attendanceCount"), "attendanceCount")
				.add(Projections.property("attendancePercent"), "attendancePercent")
				.add(Projections.property("s.name"), "studentName")
				.add(Projections.property("s.id"), "studentId")
				.add(Projections.property("a.id"), "adminId")
				.add(Projections.property("a.name"), "adminName")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(AttendanceResultDto.class));
		return (AttendanceResultDto)c.uniqueResult();
	}

}
