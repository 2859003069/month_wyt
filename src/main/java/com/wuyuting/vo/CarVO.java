package com.wuyuting.vo;

import com.wuyuting.pojo.Car;

public class CarVO extends Car{
	
	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	private Integer startPrice; //开始的价格
	private Integer endPrice; //结束的价格
	
	private String startcdate; //开始时间
	private String endcdate; //结束时间
	
	private String ctype;

	public Integer getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}

	public Integer getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(Integer endPrice) {
		this.endPrice = endPrice;
	}

	public String getStartcdate() {
		return startcdate;
	}

	public void setStartcdate(String startcdate) {
		this.startcdate = startcdate;
	}

	public String getEndcdate() {
		return endcdate;
	}

	public void setEndcdate(String endcdate) {
		this.endcdate = endcdate;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	
	
}
