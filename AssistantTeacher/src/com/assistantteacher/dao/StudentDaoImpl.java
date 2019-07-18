package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.StudentDto;
import com.assistantteacher.entity.Room;
import com.assistantteacher.entity.Student;
@Repository
@Transactional
public class StudentDaoImpl extends GenericDaoImpl<Long, Student>implements StudentDao {

	@Override
	public long saveStudent(Student student) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(student);
	}
	
	

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(student);
	}

	@Override
	public boolean deleteStudent(long id) {
		// TODO Auto-generated method stub
		try{
			Student stu=(Student)getCurrentSession().get(Student.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public List<StudentDto> getStudentList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Student.class);
				
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("roomName"), "roomName")
				.add(Projections.property("qty"), "qty"));
			
		c.setResultTransformer(Transformers.aliasToBean(StudentDto.class));
		return c.list();
	}

	@Override
	public StudentDto getStudentById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class);
				
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("roomName"), "roomName")
				.add(Projections.property("qty"), "qty"));
				
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(StudentDto.class));
		return (StudentDto)c.uniqueResult();
	}
	}

