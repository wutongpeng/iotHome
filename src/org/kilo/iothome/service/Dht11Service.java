package org.kilo.iothome.service;

import java.util.List;


import org.kilo.iothome.domain.Dht11;
import org.kilo.iothome.vo.Dht11Bean;

public interface Dht11Service {

	//����
	void addDht11(Dht11 dht);
	//��ѯ������Ϣ
    List<Dht11Bean> getall();
	
}
