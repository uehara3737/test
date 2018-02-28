package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterConfirmAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private ArrayList<BuyItemDTO> buyItemDTOList=new ArrayList<>();




	@SuppressWarnings("unchecked")
	public String execute() throws SQLException{

		List<BuyItemDTO> list=(ArrayList<BuyItemDTO>) session.get("list");

		for(int i=0; i<list.size(); i++){

			int count=list.get(i).getCount();
			int itemStock=list.get(i).getItem_stock();
			int id=list.get(i).getId();
			int totalCount=list.get(i).getTotal_count();
			String itemName=list.get(i).getItemName();


			BuyItemDTO buyItemDTO=new BuyItemDTO();
			buyItemDTO.setItemName(itemName);
			buyItemDTO.setTotal_count(totalCount);
			buyItemDTO.setCount(count);

			buyItemDTOList.add(buyItemDTO);




		MasterDAO masterDAO=new MasterDAO();
		masterDAO.itemInfo(totalCount,id);
		}

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
