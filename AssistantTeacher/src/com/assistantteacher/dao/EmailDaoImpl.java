package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assistantteacher.entity.Student;
@Repository
@Transactional
public class EmailDaoImpl implements EmailDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		 return  sessionFactory.getCurrentSession().createCriteria(Student.class).list();
	}

	@Override
	public List searchStudent(String name) {
		// TODO Auto-generated method stub
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Student.class);
		c.add(Restrictions.like("name", "%"+name+"%"));	
		List<Student> student=c.list();
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Student stu=(Student)session.get(Student.class,id);
		session.delete(stu);
		session.flush();
	}

	

}
