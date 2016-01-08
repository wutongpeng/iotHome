package org.kilo.iothome.pi.socket.service;

import org.kilo.iothome.pi.socket.SocketClientThread;
import org.kilo.iothome.pi.socket.ThreadMap;
import org.kilo.iothome.service.Dht11Service;

/**
 * @author 吴同鹏
 *
 */
public class SocketServiceImpl implements SocketService {

	private final String START_SUCCESS = "startsuccess";
	private final String START_FALSE = "startfalse";
	private final String STARTED = "started";
	private final String STOP_SUCCESS = "stopsuccess";
	private final String STOP_FALSE = "stopfalse";
	private final String STOPED = "stoped";

	private static boolean threadStatus = false;
	

	public static boolean isThreadStatus() {
		return threadStatus;
	}

	public static void setThreadStatus(boolean threadStatus) {
		SocketServiceImpl.threadStatus = threadStatus;
	}

	//开启线程
	@Override
	public String stratThread(Dht11Service dservice) {
		if (!threadStatus) {
			SocketClientThread sct = new SocketClientThread(dservice);
			sct.start();
			ThreadMap.addSocketClientThread("sct", sct);
			return START_SUCCESS;
		} else if (threadStatus) {
			return STARTED;
		}
		return START_FALSE;
	}

	//关闭线程
	@SuppressWarnings("deprecation")
	@Override
	public String stopThread() {
		if (threadStatus) {
			SocketClientThread sct = ThreadMap.getSocketClientThread("sct");
			sct.stop();
			return STOP_SUCCESS;
		} else if (!threadStatus) {
			return STOPED;
		}
		return STOP_FALSE;
	}

}
