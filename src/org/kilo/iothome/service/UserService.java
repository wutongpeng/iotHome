package org.kilo.iothome.service;

import org.kilo.iothome.domain.User;

public interface UserService {

	// 登录失败
	public static final int LOGIN_FAIL = 0;
	// 以普通员工登录
	public static final int LOGIN_USER = 1;
	/**
	 * 验证登录
	 * @param name pwd
	 * @return 登录后的身份确认:0为登录失败，1为登录emp 2为登录mgr
	 */
    int validLogin(User user);
    /**
	 * 注册
	 * @param name
	 * @return pwd
	 */
	void addUser(User user);

	
}
