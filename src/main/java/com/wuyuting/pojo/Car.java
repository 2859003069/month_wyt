package com.wuyuting.pojo;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable{

	private Integer id;
	private String cname;
	
	private Integer wx;
	private String cdate;
	private Integer cprice;
	private String tp;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getWx() {
		return wx;
	}
	public void setWx(Integer wx) {
		this.wx = wx;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public Integer getCprice() {
		return cprice;
	}
	public void setCprice(Integer cprice) {
		this.cprice = cprice;
	}
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", cname=" + cname + ", wx=" + wx + ", cdate=" + cdate + ", cprice=" + cprice + ", tp="
				+ tp + "]";
	}
	
	
	
	
	
	
	
}
