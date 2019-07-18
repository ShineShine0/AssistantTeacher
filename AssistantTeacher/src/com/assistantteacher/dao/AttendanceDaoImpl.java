package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.AttendanceDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Attendance;
import com.assistantteacher.entity.Room;
@Repository
@Transactional
public class AttendanceDaoImpl extends GenericDaoImpl<Long, Attendance> implements AttendanceDao{

	@Override
	public long saveAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(attendance);
	}

	@Override
	public void updateAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(attendance);
	}

	@Override
	public boolean deleteAttendance(long id) {
		// TODO Auto-generated method stub
		try{
			Attendance att=(Attendance)getCurrentSession().get(Attendance.class,id);
			getCurrentSession().delete(att);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
	}

	@Override
	public List<AttendanceDto> getAttendanceList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("admin", "a",JoinType.LEFT_OUTER_JOIN)
				.createAlias("student", "s",JoinType.LEFT_OUTER_JOIN)
				.createAlias("room", "r",JoinType.LEFT_OUTER_JOIN)
				.createAlias("subject", "su",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("postDate"), "postDate")
				.add(Projections.property("sysDate"), "sysDate")
				.add(Projections.property("a.name"), "adminName")
				.add(Projections.property("a.id"), "adminId")
				.add(Projections.property("s.id"), "studentId")
				.add(Projections.property("s.name"), "studentName")
				.add(Projections.property("r.name"), "roomName")
				.add(Projections.property("r.id"), "roomId")
				.add(Projections.property("su.id"), "sujectId")
				.add(Projections.property("su.name"), "subjectName")
				);
		c.setResultTransformer(Transformers.aliasToBean(AttendanceDto.class));
	
		return c.list();
	}

	@Override
	public AttendanceDto getAttendanceById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("admin", "a",JoinType.LEFT_OUTER_JOIN)
				.createAlias("student", "s",JoinType.LEFT_OUTER_JOIN)
				.createAlias("room", "r",JoinType.LEFT_OUTER_JOIN)
				.createAlias("subject", "su",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("postDate"), "postDate")
				.add(Projections.property("sysDate"), "sysDate")
				.add(Projections.property("a.name"), "adminName")
				.add(Projections.property("a.id"), "adminId")
				.add(Projections.property("s.id"), "studentId")
				.add(Projections.property("s.name"), "studentName")
				.add(Projections.property("r.name"), "roomName")
				.add(Projections.property("r.id"), "roomId")
				.add(Projections.property("su.id"), "sujectId")
				.add(Projections.property("su.name"), "subjectName")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(AttendanceDto.class));
		return (AttendanceDto)c.uniqueResult();
	}
	}

