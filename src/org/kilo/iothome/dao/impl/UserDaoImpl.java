package org.kilo.iothome.dao.impl;


import java.util.List;

import org.kilo.common.dao.impl.BaseDaoImpl;
import org.kilo.iothome.dao.UserDao;
import org.kilo.iothome.domain.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	/**
	 * 根据用户名和密码查询用户
	 * @param user 包含指定用户名、密码
	 * @return 符合指定用户名和密码的用户
	 */
	@Override
	public List<User> findByNameAndPass(User user) {
		return find("select user from User user where user.name = ?0 and user.pwd=?1"
				, user.getName() , user.getPwd());
		
	}
	
}
