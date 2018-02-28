package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemInsertDAO;
import com.internousdev.ecsite.dto.ItemInsertDTO;
import com.internousdev.ecsite.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class ItemInsertAction extends ActionSupport implements SessionAware {

	private String itemName;

	private String itemPrice;

	private String itemStock;

	public Map<String,Object> session;

	private DateUtil dateUtil=new DateUtil();

	private ItemInsertDAO dao=new ItemInsertDAO();
	private ItemInsertDTO dto=new ItemInsertDTO();

	public String execute() throws SQLException{

		String result=ERROR;
		/**
		 * @return 文字列が空白でなければsuccess、どれか空白の時errorを返す。
		 */
		if(itemName.length() != 0 && itemPrice.length() != 0 && itemStock.length() != 0){
		dto=dao.itemInsertInfo(itemName, itemPrice, itemStock);
		session.put("ItemInsert", dto);
		session.put("itemName", itemName);
		session.put("itemPrice", itemPrice);
		session.put("itemStock", itemStock);
		session.put("insertDate", dateUtil.getDate());

		 result=SUCCESS;
		return result;
		}
		return result;
	}

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}
	public void setItemStock(String itemStock){
		this.itemStock=itemStock;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
