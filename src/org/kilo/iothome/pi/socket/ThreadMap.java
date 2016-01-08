package org.kilo.iothome.pi.socket;

import java.util.HashMap;

public class ThreadMap {

    private static HashMap mt=new HashMap<String, SocketClientThread>();
	
	//把创建好的SocketClientThread放入到mt
	public static void addSocketClientThread(String id,SocketClientThread sct)
	{
		mt.put(id, sct);
	}
	
	//可以通过Id取得该线程 
	public static SocketClientThread getSocketClientThread(String id)
	{
		return (SocketClientThread)mt.get(id);
	}
}
