package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.AttendanceDao;
import com.assistantteacher.dao.GenericDaoImpl;
import com.assistantteacher.dto.AttendanceDto;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Attendance;
import com.assistantteacher.entity.Room;

@Service
public class AttendanceServiceImpl implements AttendanceService{
	@Autowired 
	AttendanceDao attendanceDao;

	@Override
	public long saveAttendance(AttendanceDto attendanceDto) {
		// TODO Auto-generated method stub
		return  attendanceDao.saveAttendance(convertAttendanceBean(attendanceDto));
	}
	
	private Attendance convertAttendanceBean(AttendanceDto attdto){
		Attendance att=new Attendance();
		if(attdto.getId()!=0){
			att.setId(attdto.getId());
		}
		att.setPostDate(attdto.getPostDate());
		att.setSysDate(attdto.getPostDate());
		att.getAdmin().setId(attdto.getAdminId());
		att.getStudent().setId(attdto.getStudentId());
		att.getRoom().setId(attdto.getRoomId());
		att.getSubject().setId(attdto.getSubjectId());
		return att;
	}

	@Override
	public void updateAttendance(AttendanceDto attendanceDto) {
		// TODO Auto-generated method stub
		attendanceDao.saveAttendance(convertAttendanceBean(attendanceDto));
	}

	@Override
	public boolean deleteAttendance(long id) {
		// TODO Auto-generated method stub
		return attendanceDao.deleteAttendance(id);
	}

	@Override
	public List<AttendanceDto> getAttendanceList() {
		// TODO Auto-generated method stub
		return attendanceDao.getAttendanceList();
	}

	@Override
	public AttendanceDto getAttendanceById(long id) {
		// TODO Auto-generated method stub
		return attendanceDao.getAttendanceById(id);
	}

	}
