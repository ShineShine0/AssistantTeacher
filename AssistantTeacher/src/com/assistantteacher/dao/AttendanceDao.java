package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.AttendanceDto;
import com.assistantteacher.entity.Attendance;



public interface AttendanceDao{
	long saveAttendance(Attendance attendance);
	void updateAttendance(Attendance attendance);
	boolean deleteAttendance(long id);
	List<AttendanceDto> getAttendanceList();
	AttendanceDto getAttendanceById(long id);
}
