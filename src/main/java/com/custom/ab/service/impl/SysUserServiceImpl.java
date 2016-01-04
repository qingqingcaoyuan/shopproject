package com.custom.ab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custom.ab.dao.SysUserDao;
import com.custom.ab.model.SysUser;
import com.custom.ab.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserDao sysUserDao;
	
	public SysUser login(String username, String passwd) {
		SysUser user = new SysUser(username, passwd);
		return sysUserDao.login(user);
	}

	public int addSysUser(SysUser user) {
		sysUserDao.addSysUser(user);
		return 1;
	}

	public void deleteUser(SysUser user) {
		sysUserDao.deleteUser(user);
	}

}
