package org.kilo.iothome.dao;

import java.util.List;

import org.kilo.common.dao.BaseDao;
import org.kilo.iothome.domain.Dht11;

public interface Dht11Dao extends BaseDao<Dht11> {

	List<Dht11> findalldht();
}
