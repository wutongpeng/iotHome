package org.kilo.iothome.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.kilo.iothome.dao.Dht11Dao;
import org.kilo.iothome.dao.UserDao;
import org.kilo.iothome.domain.Dht11;
import org.kilo.iothome.service.Dht11Service;
import org.kilo.iothome.vo.Dht11Bean;

public class Dht11ServiceImpl implements Dht11Service {

	
	@Resource
	private Dht11Dao dht11Dao;
	@Resource
	private UserDao userDao;
	

	public void setDht11Dao(Dht11Dao dht11Dao) {
		this.dht11Dao = dht11Dao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	//保存
	@Override
	public void addDht11(Dht11 dht) {
		dht11Dao.save(dht);
		
	}
    //获取所有dht数据
	@Override
	public List<Dht11Bean> getall() {
		List<Dht11> dht=dht11Dao.findalldht();
		System.out.println("Dht11ServiceImpl:"+dht);
		List<Dht11Bean> dhtbean=new ArrayList<Dht11Bean>();
		if(dht != null && dht.size() > 0){
		    for(Dht11 d : dht){
		    	dhtbean.add(new Dht11Bean(d.getId(),d.getTem()));
		    }
			return dhtbean;
		}
		return null;
	}


	
	
	
}
