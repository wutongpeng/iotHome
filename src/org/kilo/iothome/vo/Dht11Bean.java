package org.kilo.iothome.vo;

import java.io.Serializable;

public class Dht11Bean implements Serializable {

	private Integer id;
	private String tem;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTem() {
		return tem;
	}
	public void setTem(String tem) {
		this.tem = tem;
	}
	public Dht11Bean(Integer id, String tem) {
		
		this.id = id;
		this.tem = tem;
	}
	public Dht11Bean() {
		
	}
	
	
}
