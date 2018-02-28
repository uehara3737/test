package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteAction extends ActionSupport implements SessionAware {

	private List<String> name;

	private ArrayList<BuyItemDTO> itemDeleteList=new ArrayList<>();

	public Map<String,Object> session;



	//@SuppressWarnings("unchecked")
	public String execute(){

		System.out.println(name);
		System.out.println(name.size());

		session.put("name", name);
		session.put("itemDeleteListSize", name.size());


		for(int i=0; i<name.size(); i++){

			String itemName=name.get(i);


			System.out.println(itemName);

			BuyItemDTO dto=new BuyItemDTO();

			dto.setItemName(itemName);

			itemDeleteList.add(dto);
			session.put("itemDeleteList", itemDeleteList);
		}


		String result=SUCCESS;
		return result;
	}

	public List<String> getName(){
		return name;
	}

	public void setName(List<String> name){
		this.name=name;
	}

	public ArrayList<BuyItemDTO> getItemDeleteList(){
		return itemDeleteList;
	}
	public void setItemDeleteList(ArrayList<BuyItemDTO> itemDeleteList){
		this.itemDeleteList=itemDeleteList;
	}


	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
