package com.assistantteacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assistantteacher.dao.AdminDao;
import com.assistantteacher.dto.AdminDTO;
import com.assistantteacher.dto.RoomDto;
import com.assistantteacher.entity.Admin;
import com.assistantteacher.entity.Room;

@Service
public class AdminServiceImpl implements AdminService{
@Autowired
private AdminDao adminDao;
	@Override
	public long saveAdmin(AdminDTO adminDto) {
		// TODO Auto-generated method stub
		return adminDao.saveAdmin(convertAdminBean(adminDto));
	}
	private Admin convertAdminBean(AdminDTO rdto){
		Admin a=new Admin();
		if(rdto.getId()!=0){
			a.setId(rdto.getId());
		}
		a.setuName(rdto.getuName());
		a.setuPassword(rdto.getuPassword());
		a.setName(rdto.getName());
		a.setNrc(rdto.getNrc());
		a.setAddress(rdto.getAddress());
		a.setDob(rdto.getDob());
		a.setMobileNumber(rdto.getMobileNumber());
		a.setEmail(rdto.getEmail());
		a.setStatus(rdto.getStatus());
		a.getUserRole().setId(rdto.getRoleId());
		return a;
	}

	@Override
	public void updateAdmin(AdminDTO adminDto) {
		// TODO Auto-generated method stub
		adminDao.saveAdmin(convertAdminBean(adminDto));
	}

	@Override
	public boolean deleteAdmin(long id) {
		// TODO Auto-generated method stub
		return adminDao.deleteAdmin(id);
	}

	@Override
	public List<AdminDTO> getAdminList() {
		// TODO Auto-generated method stub
		return adminDao.getAdminList();
	}

	@Override
	public AdminDTO getAdminById(long id) {
		// TODO Auto-generated method stub
		return adminDao.getAdminById(id);
	}

}
