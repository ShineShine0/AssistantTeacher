package com.assistantteacher.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.YearDTO;
import com.assistantteacher.entity.Admin;
import com.assistantteacher.entity.Year;

import javassist.convert.Transformer;

@Repository
@Transactional
public class YearDaoImpl extends GenericDaoImpl<Year,Long> implements YearDao{
	
	@Override
	public void save(Year y) {
		
		getCurrentSession().save(y);
	}
   
	@Override
	public List<Year> retrieve(){
	   
		Criteria c2=getCurrentSession().createCriteria(Year.class);
		List<Year> years = (List<Year>) c2.list();
		return years;
		 
	}
	
	@Override
	public void update(Year y) {
		getCurrentSession().saveOrUpdate(y);
	}

	@Override
	public YearDTO getYearById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Year.class);
		c.add(Restrictions.eq("id", id));
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"),"id")
				.add(Projections.property("name"), "name")
				);
		c.setResultTransformer(Transformers.aliasToBean(YearDTO.class));
		return (YearDTO)c.uniqueResult();
	}
	
	@Override
	public void delete(long id) {
		Criteria c=getCurrentSession().createCriteria(Year.class);
		c.add(Restrictions.eq("id", id));
		Year y=(Year)c.uniqueResult();
		getCurrentSession().delete(y);
		getCurrentSession().flush();
	}
		
}
