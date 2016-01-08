package org.kilo.iothome.web.action;

import org.kilo.iothome.pi.socket.service.SocketService;
import org.kilo.iothome.service.Dht11Service;
import org.kilo.iothome.web.action.base.SuperAction;

public class PiManageAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Dht11Service getDservice() {
		return dservice;
	}

	public void setDservice(Dht11Service dservice) {
		this.dservice = dservice;
	}
	private SocketService sservice;
	private Dht11Service dservice;
	

	public void setSservice(SocketService sservice) {
		this.sservice = sservice;
	}
	private String cmd;
	
	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String execute(){
		if(cmd.equals("start")){
			return sservice.stratThread(getDservice());
		}else if(cmd.equals("stop")){
			return sservice.stopThread();
		}
		return null;
	}
}
