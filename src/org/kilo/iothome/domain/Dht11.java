package org.kilo.iothome.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Œ‚Õ¨≈Ù
 *Dht11±Ì
 *
 */
@Entity
@Table(name="dht11_inf")
public class Dht11 implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	public Dht11() {
		
	}
	public Dht11(Integer id, String tem) {
		
		this.id = id;
		this.tem = tem;
	}
	
	
}
