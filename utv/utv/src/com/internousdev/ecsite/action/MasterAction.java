package com.internousdev.ecsite.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAction extends ActionSupport implements SessionAware {

	private ArrayList<BuyItemDTO> buyItemDTOList=new ArrayList<>();

	private List<String> count;

	public Map<String,Object> session;

	public String execute(){
		String result=SUCCESS;

		session.put("count", count);

		@SuppressWarnings("unchecked")
		List<BuyItemDTO> list=(List<BuyItemDTO>) session.get("buyItemDTOList");

		for(int i=0; i<count.size(); i++){
			BuyItemDTO buyItemDTO=new BuyItemDTO();

			String itemName=list.get(i).getItemName();
			int itemStock=list.get(i).getItem_stock();
			int intCount=Integer.parseInt(count.get(i));
			int id=list.get(i).getId();
			int totalCount=itemStock + intCount;
			if(intCount != 0){
				buyItemDTO.setItemName(itemName);
				buyItemDTO.setItem_stock(itemStock);
				buyItemDTO.setCount(intCount);
				buyItemDTO.setId(id);
				buyItemDTO.setTotal_count(totalCount);

				buyItemDTOList.add(buyItemDTO);
			}
			session.put("list",buyItemDTOList);
		}


		return result;

	}

	public List<String> getCount(){
		return count;
	}
	public void setCount(List<String> count){
		this.count=count;
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
