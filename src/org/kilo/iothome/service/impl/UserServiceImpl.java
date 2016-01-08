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
	 * �Ծ����������֤��¼
	 * @param mgr ��¼�ľ������
	 * @return ��¼������ȷ��:0Ϊ��¼ʧ�ܣ�1Ϊ��¼emp 2Ϊ��¼mgr
	 */
	public int validLogin(User user)
	{
		// ����ҵ�һ�������Ծ����¼
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
