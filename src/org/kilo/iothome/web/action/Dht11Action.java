package org.kilo.iothome.web.action;


import java.io.InputStream;
import java.io.StringBufferInputStream;
import javax.annotation.Resource;

import org.kilo.iothome.domain.Dht11;
import org.kilo.iothome.pi.socket.SocketClient;
import org.kilo.iothome.pi.socket.SocketData;
import org.kilo.iothome.pi.socket.service.SocketServiceImpl;
import org.kilo.iothome.service.Dht11Service;

import com.opensymphony.xwork2.ActionSupport;

public class Dht11Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InputStream inputStream; 
	
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	
	@SuppressWarnings("deprecation")
	public String execute() throws Exception
	{
		System.out.println("******************************************************");
		String temp=null;
		if(SocketServiceImpl.isThreadStatus()){
			temp=SocketData.getTem();
		}
		temp="Éè±¸Î´¿ªÆô";
		System.out.println(temp);
		inputStream = new StringBufferInputStream(temp);  
        return SUCCESS;  
			
	}
}
