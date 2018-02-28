package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoItemUpdateAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private List<BuyItemDTO> buyItemDTOList;

	@SuppressWarnings("unchecked")
	public String execute(){

		buyItemDTOList=(List<BuyItemDTO>) session.get("buyItemDTOList");
		//session.put("buyItemDTOList", buyItemDTOList);

		String result=SUCCESS;
		return result;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
