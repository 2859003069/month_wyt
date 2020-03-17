package com.wuyuting.pojo;

import java.io.Serializable;

public class CarType implements Serializable{

	private Integer id;
	private String ctype;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public String toString() {
		return "CarType [id=" + id + ", ctype=" + ctype + "]";
	}
	
	
	
}
