package org.kilo.iothome.dao.impl;

import java.util.List;

import org.kilo.common.dao.impl.BaseDaoImpl;
import org.kilo.iothome.dao.Dht11Dao;
import org.kilo.iothome.domain.Dht11;

public class Dht11DaoImpl extends BaseDaoImpl<Dht11> implements Dht11Dao {



	@Override
	public List<Dht11> findalldht() {
		// TODO Auto-generated method stub
		List<Dht11> list=find("select dht from Dht11 dht");
		return list;
	}

	

}
