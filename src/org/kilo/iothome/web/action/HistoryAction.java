package org.kilo.iothome.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.kilo.iothome.service.Dht11Service;

import com.opensymphony.xwork2.ActionSupport;

public class HistoryAction  extends ActionSupport{

	@Resource
	private Dht11Service dht11service;

	public void setDht11service(Dht11Service dht11service) {
		this.dht11service = dht11service;
	}
	//·â×°dht¶ÔÏó
	private List dhts;
	
	public List getDhts() {
		return dhts;
	}

	public void setDhts(List dhts) {
		this.dhts = dhts;
	}

	public String execute() throws Exception
	{
		setDhts(dht11service.getall());
		System.out.println("*****************HistoryAction****************************");
		System.out.println("getDhts():"+getDhts());
		return SUCCESS;
	}
}
