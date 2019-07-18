package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.MajorDto;
import com.assistantteacher.entity.Major;
import com.assistantteacher.entity.Room;

@Repository
@Transactional
public class MajorDaoImpl extends GenericDaoImpl<Long, Major> implements MajorDao{

	@Override
	public List<MajorDto> getMajorList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(MajorDto.class).list();
	}

	@Override
	public long saveMajor(Major major) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(major);

	}

	@Override
	public void updateMajor(Major major) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(major);

	}

	@Override
	public boolean deleteMajor(long id) {
		// TODO Auto-generated method stub
		try{
			Major stu=(Major)getCurrentSession().get(Major.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public MajorDto getMajorById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Major.class);
		c.add(Restrictions.eq("id", id));
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("name"), "name")
				.add(Projections.property("longName"),"longName")
				
				);
		c.setResultTransformer(Transformers.aliasToBean(Major.class));
		return (MajorDto)c.uniqueResult();
	}

	
}
