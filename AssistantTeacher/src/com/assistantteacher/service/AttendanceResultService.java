package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.AttendanceResultDto;
import com.assistantteacher.dto.RoomDto;



public interface AttendanceResultService {
	long saveAttendanceResult(AttendanceResultDto attendanceResultDto);
	void updateAttendanceResult(AttendanceResultDto attendanceResultDto);
	boolean deleteAttendanceResult(long id);
	List<AttendanceResultDto> getAttendanceResultList();
	AttendanceResultDto getAttendanceResultById(long id);
}
