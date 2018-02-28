package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoItemDeleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private ArrayList<BuyItemDTO> buyItemDTOList=new ArrayList<>();

	@SuppressWarnings("unchecked")
	public String execute(){

		buyItemDTOList=(ArrayList<BuyItemDTO>) session.get("buyItemDTOList");
		//session.put("buyItemDTOList", buyItemDTOList);

		String result=SUCCESS;
		return result;
	}

	public ArrayList<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(ArrayList<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
