package com.custom.ab.service;

import com.custom.ab.model.SysUser;

public interface SysUserService {
	public SysUser login(String username, String passwd);
	public int addSysUser(SysUser user);
	
	public void deleteUser(SysUser user);
}
