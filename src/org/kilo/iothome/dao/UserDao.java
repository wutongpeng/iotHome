package org.kilo.iothome.dao;

import java.util.List;

import org.kilo.common.dao.BaseDao;
import org.kilo.iothome.domain.User;

public interface UserDao extends BaseDao<User> {

	List<User> findByNameAndPass(User user);
}
