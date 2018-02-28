package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	public String execute() throws SQLException{

		@SuppressWarnings("unchecked")
		List<String> name=(List<String>) session.get("name");
		for(int i=0; i<name.size(); i++){
			@SuppressWarnings("unchecked")
			List<BuyItemDTO> list=(List<BuyItemDTO>) session.get("itemDeleteList");
			String itemName=list.get(i).getItemName();

			ItemDeleteCompleteDAO dao=new ItemDeleteCompleteDAO();
			dao.itemDeleteInfo(itemName);
		}
		String result=SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
