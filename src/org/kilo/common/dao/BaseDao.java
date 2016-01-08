package org.kilo.common.dao;

import java.io.Serializable;
import java.util.List;

public  interface BaseDao<T>{
	
	// ����ʵ��
	Serializable save(T entity);
	// ����ʵ��
	void update(T entity);
	// ɾ��ʵ��
	void delete(T entity);
	// ����IDɾ��ʵ��
	void delete(Class<T> entityClazz , Serializable id);
	// ��ȡ����ʵ��
	List<T> findAll(Class<T> entityClazz);
	// ��ȡʵ������
	long findCount(Class<T> entityClazz);
	// ����ID����ʵ��
	T get(Class<T> entityClazz , Serializable id);

}
