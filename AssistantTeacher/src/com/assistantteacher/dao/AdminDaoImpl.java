package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.AdminDTO;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Admin;
import com.assistantteacher.entity.Room;
@Repository
@Transactional
public class AdminDaoImpl extends GenericDaoImpl<Long, Admin>implements AdminDao{

	@Override
	public long saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(admin);
	}

	@Override
	public boolean deleteAdmin(long id) {
		// TODO Auto-generated method stub
		try{
			Admin ad=(Admin)getCurrentSession().get(Admin.class,id);
			getCurrentSession().delete(ad);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
	}

	@Override
	public List<AdminDTO> getAdminList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("role", "r",JoinType.LEFT_OUTER_JOIN);
				
				
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("uName"), "uName")
				.add(Projections.property("name"), "name")
				.add(Projections.property("nrc"), "nrc")
				.add(Projections.property("address"), "address")
				.add(Projections.property("dob"), "dob")
				.add(Projections.property("mobileNumber"), "mobileNumber")
				.add(Projections.property("email"), "email")
				.add(Projections.property("status"), "status")
				.add(Projections.property("r.id"), "roleId")
				.add(Projections.property("r.name"), "roleName")
				);
		c.setResultTransformer(Transformers.aliasToBean(AdminDTO.class));
		return c.list();
	}

	@Override
	public AdminDTO getAdminById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Room.class)
				.createAlias("role", "r",JoinType.LEFT_OUTER_JOIN);
				
				
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("uName"), "uName")
				.add(Projections.property("name"), "name")
				.add(Projections.property("nrc"), "nrc")
				.add(Projections.property("address"), "address")
				.add(Projections.property("dob"), "dob")
				.add(Projections.property("mobileNumber"), "mobileNumber")
				.add(Projections.property("email"), "email")
				.add(Projections.property("status"), "status")
				.add(Projections.property("r.id"), "roleId")
				.add(Projections.property("r.name"), "roleName")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(AdminDTO.class));
		return (AdminDTO)c.uniqueResult();
	}

	
	}


