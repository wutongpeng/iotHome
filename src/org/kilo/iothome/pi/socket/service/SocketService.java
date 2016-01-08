package org.kilo.iothome.pi.socket.service;

import org.kilo.iothome.service.Dht11Service;

public interface SocketService {

	
	public String stratThread(Dht11Service dservice);
	public String stopThread();
	
}
