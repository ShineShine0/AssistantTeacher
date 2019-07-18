package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.AttendanceResultDto;
import com.assistantteacher.entity.AttendanceResult;



public interface AttendanceResultDao {

	long saveAttendanceResult(AttendanceResult attendanceResult);
	void updateAttendanceResult(AttendanceResult attendanceResult);
	boolean deleteAttendanceResult(long id);
	List<AttendanceResultDto> getAttendanceResultList();
	AttendanceResultDto getAttendanceResultById(long id);
}
