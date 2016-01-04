package com.custom.ab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.custom.ab.model.SysUser;
import com.custom.ab.service.SysUserService;
@RequestMapping("/")
@Controller
public class LoginController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping(value="toLogin", method=RequestMethod.GET)
	public String toLogin(HttpServletRequest request){
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(HttpServletRequest request, SysUser sysUser){
		SysUser user = sysUserService.login(sysUser.getUsername(), sysUser.getPasswd());
		if(user==null){
			return "redirect:/toLogin";
		}
		return "common/main";
	}
}
