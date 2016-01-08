package org.kilo.iothome.pi.socket;

import org.kilo.iothome.domain.Dht11;
import org.kilo.iothome.service.Dht11Service;

public class SocketClientThread extends Thread{

	private Dht11Service dservice;
	SocketClient sc=new SocketClient();
	public SocketClientThread(Dht11Service dservice) {
		this.dservice=dservice;
	}
	public void run(){
		while(true){
			try {				
			  String tem=sc.getTem();		  
			  SocketData.setTem(tem);
			  Dht11 dht=new Dht11();
		      dht.setTem(tem);
			  dservice.addDht11(dht);
			  sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
