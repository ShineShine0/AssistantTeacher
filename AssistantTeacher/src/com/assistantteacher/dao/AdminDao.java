package com.assistantteacher.dao;

import java.util.List;

import com.assistantteacher.dto.AdminDTO;
import com.assistantteacher.entity.Admin;


public interface AdminDao {
	long saveAdmin(Admin admin);
	void updateAdmin(Admin admin);
	boolean deleteAdmin(long id);
	List<AdminDTO> getAdminList();
	AdminDTO getAdminById(long id);
}
