package org.kilo.iothome.pi.socket;

public class SocketClient {

	private String tem;
	private int i;
	public SocketClient(){
		i=10;
	}
	public String getTem(){
		tem=String.valueOf(i);
		i += 1;
		return tem;
	}
}
