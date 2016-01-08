package org.kilo.iothome.service;

import org.kilo.iothome.domain.User;

public interface UserService {

	// ��¼ʧ��
	public static final int LOGIN_FAIL = 0;
	// ����ͨԱ����¼
	public static final int LOGIN_USER = 1;
	/**
	 * ��֤��¼
	 * @param name pwd
	 * @return ��¼������ȷ��:0Ϊ��¼ʧ�ܣ�1Ϊ��¼emp 2Ϊ��¼mgr
	 */
    int validLogin(User user);
    /**
	 * ע��
	 * @param name
	 * @return pwd
	 */
	void addUser(User user);

	
}
