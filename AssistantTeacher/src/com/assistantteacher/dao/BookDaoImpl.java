package com.assistantteacher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.assistantteacher.dto.BookDto;

import com.assistantteacher.entity.Book;


@Repository
@Transactional
public class BookDaoImpl extends GenericDaoImpl<Long, Book> implements BookDao {

	@Override
	public long saveBook(Book book) {
		// TODO Auto-generated method stub
		return (long)getCurrentSession().save(book);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(book);
	}

	@Override
	public boolean deleteBook(long id) {
		// TODO Auto-generated method stub
		try{
			Book stu=(Book)getCurrentSession().get(Book.class,id);
			getCurrentSession().delete(stu);
			getCurrentSession().flush();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Book.class)
				.createAlias("year", "y",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("bookName"), "bookName")
				.add(Projections.property("price"), "price")
				.add(Projections.property("author"), "author")
				.add(Projections.property("isbn"), "isbn")
				.add(Projections.property("edition"), "edition")
				.add(Projections.property("y.name"), "yearName")
				.add(Projections.property("y.id"), "yearId")
				);
		c.setResultTransformer(Transformers.aliasToBean(BookDto.class));
		return c.list();
	}

	@Override
	public BookDto getBookById(long id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Book.class)
				.createAlias("year", "y",JoinType.LEFT_OUTER_JOIN)
				;
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")
				.add(Projections.property("bookName"), "bookName")
				.add(Projections.property("price"), "price")
				.add(Projections.property("author"), "author")
				.add(Projections.property("isbn"), "isbn")
				.add(Projections.property("edition"), "edition")
				.add(Projections.property("y.name"), "yearName")
				.add(Projections.property("y.id"), "yearId")
				);
		c.add(Restrictions.eq("id", id));
		c.setResultTransformer(Transformers.aliasToBean(BookDto.class));
		return (BookDto)c.uniqueResult();
	}
	

}
