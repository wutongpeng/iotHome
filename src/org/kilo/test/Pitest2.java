package org.kilo.test;

import org.kilo.iothome.pi.socket.service.SocketService;
import org.kilo.iothome.pi.socket.service.SocketServiceImpl;

public class Pitest2 {

	public static void main(String[] args) {
		SocketService ssi=new SocketServiceImpl();
		ssi.stopThread();
		System.out.println("ssistop");

	}

}
