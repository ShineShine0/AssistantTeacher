package com.assistantteacher.service;

import java.util.List;

import com.assistantteacher.dto.AdminDTO;


public interface AdminService {
	long saveAdmin(AdminDTO adminDto);
	void updateAdmin(AdminDTO adminDto);
	boolean deleteAdmin(long id);
	List<AdminDTO> getAdminList();
	AdminDTO getAdminById(long id);

}
