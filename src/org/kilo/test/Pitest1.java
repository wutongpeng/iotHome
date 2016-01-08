package org.kilo.test;

import org.kilo.iothome.pi.socket.SocketData;
import org.kilo.iothome.pi.socket.service.SocketService;
import org.kilo.iothome.pi.socket.service.SocketServiceImpl;

public class Pitest1 {

	public static void main(String[] args) {
		SocketService ssi=new SocketServiceImpl();
		//ssi.stratThread();
		System.out.println("ssiok");
		WriteThread wt=new WriteThread();		
		Thread t=new Thread(wt);
		t.start();
		System.out.println("wtok");

	}

}
class WriteThread extends Thread{
	public void Run() throws InterruptedException{
		while(true){
			System.out.println("**********");
			System.out.println(SocketData.getTem());
			sleep(1000);
		}
		
	}
}
