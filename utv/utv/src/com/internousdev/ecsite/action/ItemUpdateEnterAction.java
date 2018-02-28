package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemUpdateCompleteDAO;
import com.internousdev.ecsite.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class ItemUpdateEnterAction extends ActionSupport implements SessionAware {

	private String item_name;

	private String item_price;

	private String item_stock;

	public Map<String,Object> session;

	private ItemUpdateCompleteDAO dao=new ItemUpdateCompleteDAO();

	private DateUtil dateUtil=new DateUtil();

	public String execute() throws SQLException{

		int id=(int) session.get("updateId");

		dao.itemUpdateInfo(item_name, item_price, item_stock, id);

		session.put("item_name", item_name);
		session.put("item_price", item_price);
		session.put("item_stock", item_stock);
		session.put("update_date", dateUtil.getDate());

		String result = SUCCESS;
		return result;

	}


	public String getItem_name(){
		return item_name;
	}
	public void setItem_name(String item_name){
		this.item_name=item_name;
	}

	public String getItem_price(){
		return item_price;
	}
	public void setItem_price(String item_price){
		this.item_price=item_price;
	}

	public String getItem_stock(){
		return item_stock;
	}
	public void setItem_stock(String item_stock){
		this.item_stock=item_stock;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
