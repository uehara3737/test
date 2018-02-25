package com.uehara.Utv.util;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {

	public String getDate(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
	return sdf.format(date);
	}



	private java.util.Date now=new java.util.Date();

	public java.util.Date getNow(){
		return now;
		}


	public void setNow(java.util.Date now){
		this.now=now;
	}
	public String execute(){
		return "success";
	}

}
