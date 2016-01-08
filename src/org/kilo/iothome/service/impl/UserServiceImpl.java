package org.kilo.iothome.service.impl;


import javax.annotation.Resource;

import org.kilo.iothome.dao.Dht11Dao;
import org.kilo.iothome.dao.UserDao;
import org.kilo.iothome.domain.User;
import org.kilo.iothome.service.UserService;

public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Resource
	private Dht11Dao dht11Dao;


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void setDht11Dao(Dht11Dao dht11Dao) {
		this.dht11Dao = dht11Dao;
	}

	/**
	 * 以经理身份来验证登录
	 * @param mgr 登录的经理身份
	 * @return 登录后的身份确认:0为登录失败，1为登录emp 2为登录mgr
	 */
	public int validLogin(User user)
	{
		// 如果找到一个经理，以经理登录
		if (userDao.findByNameAndPass(user).size() >= 1)
		{
			return LOGIN_USER;
		}else{
			return LOGIN_FAIL;
		}
	}

	@Override
	public void addUser(User user) {
		userDao.save(user);
		
	}
}
