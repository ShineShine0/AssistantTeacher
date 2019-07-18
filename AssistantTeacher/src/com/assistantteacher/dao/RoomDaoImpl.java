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
import com.assistantteacher.entity.Room;

@Repository
@Transactional
public class RoomDaoImpl extends GenericDaoImpl<Long, Room> implements RoomDao {

	@Override
	public long saveRoom(Room room) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(room);
	}

	@Override
	public boolean deleteRoom(long id) {
		// TODO Auto-generated method stub
		try{
			Room stu=(Room)getCurrentSession().get(Room.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
		
	}

	@Override
	public List<RoomDto> getRoomList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("year", "y",JoinType.LEFT_OUTER_JOIN)
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("name"), "name")
				.add(Projections.property("qty"), "qty")
				.add(Projections.property("y.name"), "yearName")
				.add(Projections.property("y.id"), "yearId")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				);
		c.setResultTransformer(Transformers.aliasToBean(RoomDto.class));
		return c.list();
	}

	@Override
	public RoomDto getRoomById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("year", "y",JoinType.LEFT_OUTER_JOIN)
				.createAlias("teacher", "t",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("roomName"), "roomName")
				.add(Projections.property("qty"), "qty")
				.add(Projections.property("y.name"), "yearName")
				.add(Projections.property("y.id"), "yearId")
				.add(Projections.property("t.id"), "teacherId")
				.add(Projections.property("t.name"), "teacherName")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(RoomDto.class));
		return (RoomDto)c.uniqueResult();
	}

}
