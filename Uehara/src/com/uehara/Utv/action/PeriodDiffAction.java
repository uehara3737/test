package com.uehara.Utv.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport ;
import com.uehara.Utv.DAO.PeriodDiffDAO;

public class PeriodDiffAction extends ActionSupport {
	public String loginIdjsp;


	public Map<String,Object>session;
	private String result;
	PeriodDiffDAO pdDAO=new PeriodDiffDAO();

}
