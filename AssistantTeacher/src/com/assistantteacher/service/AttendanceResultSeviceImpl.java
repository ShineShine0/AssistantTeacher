package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.assistantteacher.dao.AttendanceResultDao;
import com.assistantteacher.dto.AttendanceResultDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.AttendanceResult;
import com.assistantteacher.entity.Room;

public class AttendanceResultSeviceImpl implements AttendanceResultService{
	
	@Autowired
   AttendanceResultDao attendanceResultDao;

	@Override
	public long saveAttendanceResult(AttendanceResultDto attendanceResultDto) {
		// TODO Auto-generated method stub
		return attendanceResultDao.saveAttendanceResult(convertAttendanceResultBean(attendanceResultDto));
	}
	
	private AttendanceResult convertAttendanceResultBean(AttendanceResultDto attendanceResultDto){
		AttendanceResult r=new AttendanceResult();
		if(attendanceResultDto.getId()!=0){
			r.setId(attendanceResultDto.getId());
		}
		r.setAttendanceCount(attendanceResultDto.getAttendanceCount());
		r.setAttendancePercent(attendanceResultDto.getAttendancePercent());
		r.getStudent().setId(attendanceResultDto.getStudentId());
		r.getAdmin().setId(attendanceResultDto.getAdminId());
		
		return r;
	}

	@Override
	public void updateAttendanceResult(AttendanceResultDto attendanceResultDto) {
		// TODO Auto-generated method stub
		attendanceResultDao.saveAttendanceResult(convertAttendanceResultBean(attendanceResultDto));
	}

	@Override
	public boolean deleteAttendanceResult(long id) {
		// TODO Auto-generated method stub
		return attendanceResultDao.deleteAttendanceResult(id);
	}

	@Override
	public List<AttendanceResultDto> getAttendanceResultList() {
		// TODO Auto-generated method stub
		return attendanceResultDao.getAttendanceResultList();
	}

	@Override
	public AttendanceResultDto getAttendanceResultById(long id) {
		// TODO Auto-generated method stub
		return attendanceResultDao.getAttendanceResultById(id);
	}

}
