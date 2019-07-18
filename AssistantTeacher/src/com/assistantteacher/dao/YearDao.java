package com.assistantteacher.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.scheduling.config.Task;

import com.assistantteacher.dto.YearDTO;
import com.assistantteacher.entity.Year;

public interface YearDao  {
	
	void save(Year y);
	List<Year> retrieve(); 
	void update(Year y);
	YearDTO getYearById(long id);
    void delete(long id);
}
