package com.internousdev.ecsite.action;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemUpdateDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemUpdateAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private int id;



	private List<BuyItemDTO> list=new ArrayList<>();

	private ItemUpdateDAO dao=new ItemUpdateDAO();

	public String execute(){


		list=dao.itemUpdateInfo(id);

		String selectName=list.get(0).getItemName();
		String selectPrice=list.get(0).getItemPrice();
		int selectStock=list.get(0).getItem_stock();

		session.put("itemName", selectName);
		session.put("itemPrice", selectPrice);
		session.put("itemStock", selectStock);


		session.put("updateId", id);

		System.out.println(id);

		String result=SUCCESS;
		return result;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}



	public List<BuyItemDTO> getList(){
		return list;
	}
	public void setList(List<BuyItemDTO> list){
		this.list=list;
	}


	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
