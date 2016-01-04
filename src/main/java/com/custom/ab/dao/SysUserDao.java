package com.custom.ab.dao;

import com.custom.ab.model.SysUser;

public interface SysUserDao {
	
	public int addSysUser(SysUser sysUser);
	
	public void deleteUser(SysUser sysUser);

	public SysUser login(SysUser user);
}
