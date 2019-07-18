package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.AttendanceDto;



public interface AttendanceService {

	long saveAttendance(AttendanceDto attendanceDto);
	void updateAttendance(AttendanceDto attendanceDto);
	boolean deleteAttendance(long id);
	List<AttendanceDto> getAttendanceList();
	AttendanceDto getAttendanceById(long id);
}
