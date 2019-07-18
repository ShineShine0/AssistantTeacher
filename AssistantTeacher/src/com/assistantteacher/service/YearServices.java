/**
 * 
 */
package com.assistantteacher.service;

import java.util.List;

import org.springframework.scheduling.config.Task;

import com.assistantteacher.dto.YearDTO;
import com.assistantteacher.entity.Year;

/**
 * @author Ksh
 *
 */
public interface YearServices {

	void saveYear(YearDTO y);
	List<Year> retrieve();
	void update(YearDTO y);
	YearDTO getYearById(long id);
	void delete(long id);
}
