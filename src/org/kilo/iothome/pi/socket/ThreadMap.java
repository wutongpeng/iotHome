package org.kilo.iothome.pi.socket;

import java.util.HashMap;

public class ThreadMap {

    private static HashMap mt=new HashMap<String, SocketClientThread>();
	
	//�Ѵ����õ�SocketClientThread���뵽mt
	public static void addSocketClientThread(String id,SocketClientThread sct)
	{
		mt.put(id, sct);
	}
	
	//����ͨ��Idȡ�ø��߳� 
	public static SocketClientThread getSocketClientThread(String id)
	{
		return (SocketClientThread)mt.get(id);
	}
}
