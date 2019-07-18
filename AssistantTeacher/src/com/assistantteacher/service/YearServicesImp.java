package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.YearDao;
import com.assistantteacher.dto.YearDTO;
import com.assistantteacher.entity.Year;


@Service
public class YearServicesImp implements YearServices {

	@Autowired
    private YearDao yeardao;	
    
	@Override
	public void saveYear(YearDTO y) {
		Year ye= new Year();
		ye.setName(y.getName());
		
		yeardao.save(ye);
	}

	@Override
	public List<Year> retrieve() {
		
		return yeardao.retrieve();
	}

	@Override
	public void update(YearDTO y) {
		try {
			Year ye= new Year();
			ye.setId(y.getId());
			ye.setName(y.getName());
			yeardao.update(ye);
		}catch (Exception e) {
			// TODO: handle exception
			throw  e;
		}
	
		
	}

	@Override
	public YearDTO getYearById(long id) {
		// TODO Auto-generated method stub
		
		return yeardao.getYearById(id);
	}

	@Override
	public void delete(long id) {
		
		yeardao.delete(id);
		
	}

	
	
}
