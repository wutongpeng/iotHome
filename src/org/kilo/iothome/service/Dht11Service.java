package org.kilo.iothome.service;

import java.util.List;


import org.kilo.iothome.domain.Dht11;
import org.kilo.iothome.vo.Dht11Bean;

public interface Dht11Service {

	//保存
	void addDht11(Dht11 dht);
	//查询所有信息
    List<Dht11Bean> getall();
	
}
