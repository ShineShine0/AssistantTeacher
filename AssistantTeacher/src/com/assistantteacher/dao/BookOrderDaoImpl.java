package com.assistantteacher.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;

import com.assistantteacher.dto.BookOrderDto;

import com.assistantteacher.entity.BookOrder;


public class BookOrderDaoImpl extends GenericDaoImpl<Long, BookOrder> implements BookOrderDao {

	@Override
	public long saveBookOrder(BookOrder bookOrder) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(bookOrder);
	}

	@Override
	public void updateBookOrder(BookOrder bookOrder) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(bookOrder);
	}

	@Override
	public boolean deleteBookOrder(long id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try{
					BookOrder stu=(BookOrder)getCurrentSession().get(BookOrder.class,id);
					getCurrentSession().delete(stu);
					getCurrentSession().flush();
					return true;
				}catch(Exception ex){
					return false;
				}
	}

	@Override
	public List<BookOrderDto> getBookOrderList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(BookOrder.class)
				.createAlias("admin", "a",JoinType.LEFT_OUTER_JOIN)
				.createAlias("student", "s",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("postDate"), "postDate")
				.add(Projections.property("count"), "count")
				.add(Projections.property("totalAmount"), "totalAmount")
				.add(Projections.property("inviceNo"), "inviceNo")
				.add(Projections.property("studentResponse"), "studentResponse")
				.add(Projections.property("s.name"), "studentName")
				.add(Projections.property("s.id"), "studentId")
				.add(Projections.property("a.id"), "adminId")
				.add(Projections.property("a.name"), "adminName")
				);
		c.setResultTransformer(Transformers.aliasToBean(BookOrderDto.class));
		return c.list();
	}

	@Override
	public BookOrderDto getBookOrderById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(BookOrder.class)
				.createAlias("admin", "a",JoinType.LEFT_OUTER_JOIN)
				.createAlias("student", "s",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("postDate"), "postDate")
				.add(Projections.property("count"), "count")
				.add(Projections.property("totalAmount"), "totalAmount")
				.add(Projections.property("inviceNo"), "inviceNo")
				.add(Projections.property("studentResponse"), "studentResponse")
				.add(Projections.property("s.name"), "studentName")
				.add(Projections.property("s.id"), "studentId")
				.add(Projections.property("a.id"), "adminId")
				.add(Projections.property("a.name"), "adminName")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(BookOrderDto.class));
		return (BookOrderDto)c.uniqueResult();
	}
	

}
