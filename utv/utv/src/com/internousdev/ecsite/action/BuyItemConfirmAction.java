package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;


	private ArrayList<BuyItemDTO> buyItemDTOList = new ArrayList<>();

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author internous
	 */

	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {

		buyItemDTOList=(ArrayList<BuyItemDTO>) session.get("list");





		for(int i=0; i<buyItemDTOList.size(); i++){

			int a=buyItemDTOList.get(i).getItem_stock();


			int id=buyItemDTOList.get(i).getId();

			int b=buyItemDTOList.get(i).getTotal_price();
			String total_price=String.valueOf(b);

			int count=buyItemDTOList.get(i).getCount();


			int item_stock= a - count;
			System.out.println(item_stock);

			if(item_stock<0){
				String result=ERROR;
				return result;
			}




		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
		buyItemCompleteDAO.buyItemeInfo(
				id,
				session.get("login_user_id").toString(),
				total_price,
				count,
				buyItemDTOList.get(i).pay,
				item_stock);
		}
		String result = SUCCESS;
		return result;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
