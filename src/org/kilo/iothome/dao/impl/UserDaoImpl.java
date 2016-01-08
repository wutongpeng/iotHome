package org.kilo.iothome.dao.impl;


import java.util.List;

import org.kilo.common.dao.impl.BaseDaoImpl;
import org.kilo.iothome.dao.UserDao;
import org.kilo.iothome.domain.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	/**
	 * �����û����������ѯ�û�
	 * @param user ����ָ���û���������
	 * @return ����ָ���û�����������û�
	 */
	@Override
	public List<User> findByNameAndPass(User user) {
		return find("select user from User user where user.name = ?0 and user.pwd=?1"
				, user.getName() , user.getPwd());
		
	}
	
}
