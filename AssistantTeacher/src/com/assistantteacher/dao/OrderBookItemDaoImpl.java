package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;
import com.assistantteacher.dto.OrderBookItemDto;
import com.assistantteacher.entity.OrderBookItem;
@Repository
@Transactional
public class OrderBookItemDaoImpl extends GenericDaoImpl<Long,OrderBookItem> implements OrderBookItemDao{

	@Override
	public long saveOrderBookItem(OrderBookItem orderBookItem) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(orderBookItem);
	}

	@Override
	public void updateOrderBookItem(OrderBookItem orderBookItem) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(orderBookItem);
	}

	@Override
	public boolean deleteOrderBookItem(long id) {
		// TODO Auto-generated method stub
		try{
			OrderBookItem stu=(OrderBookItem)getCurrentSession().get(OrderBookItem.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
	}

	@Override
	public List<OrderBookItemDto> getOrderBookItemList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(OrderBookItem.class)
				.createAlias("book", "b",JoinType.LEFT_OUTER_JOIN)
				.createAlias("bookOrder", "bo",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("qty"), "qty")
				.add(Projections.property("availableStatus"), "availableStatus")
				.add(Projections.property("amount"), "amount")
				.add(Projections.property("totalAmount"), "totalAmount")
				.add(Projections.property("b.name"), "bookName")
				.add(Projections.property("b.id"), "bookId")
				.add(Projections.property("bo.id"), "bookOrderId")
				);
		c.setResultTransformer(Transformers.aliasToBean(OrderBookItemDto.class));
		return c.list();
	}

	@Override
	public OrderBookItemDto getOrderBookItemById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(OrderBookItem.class)
				.createAlias("book", "b",JoinType.LEFT_OUTER_JOIN)
				.createAlias("bookOrder", "bo",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("qty"), "qty")
				.add(Projections.property("availableStatus"), "availableStatus")
				.add(Projections.property("amount"), "amount")
				.add(Projections.property("totalAmount"), "totalAmount")
				.add(Projections.property("b.name"), "bookName")
				.add(Projections.property("b.id"), "bookId")
				.add(Projections.property("bo.id"), "bookOrderId")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(OrderBookItemDto.class));
		return (OrderBookItemDto)c.uniqueResult();
	}

}
