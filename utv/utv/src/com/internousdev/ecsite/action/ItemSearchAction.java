package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemSearchDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemSearchAction extends ActionSupport implements SessionAware {

	/**
	 * 検索ワード
	 */
	private String searchWord;

	private String message;

	public Map<String, Object> session;

	/**
	 * 検索結果格納List
	 */
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	/**
	 * 検索結果取得
	 */
	private ItemSearchDAO itemSearchDAO = new ItemSearchDAO();

	/**
	 * 実行メソッド
	 *
	 */
	@SuppressWarnings("unchecked")
	public String execute(){

		String result = ERROR;


		 //ワードを入力した時のみ実行
		if(searchWord.equals("")){

			result = ERROR;
			buyItemDTOList =(List<BuyItemDTO>) session.get("buyItemDTOList");
			setMessage("該当する商品が見つかりませんでした。");

		}else{

			buyItemDTOList = itemSearchDAO.getItemInfo(searchWord);


			if(buyItemDTOList.size() > 0){
				session.put("buyItemDTOList", buyItemDTOList);
				int itemCount = buyItemDTOList.size();
				String count = Integer.toString(itemCount);
				setMessage(count + "件の商品が見つかりました。");

				result = SUCCESS;
			}else{
				result = ERROR;
				buyItemDTOList =(List<BuyItemDTO>) session.get("buyItemDTOList");
				setMessage("該当する商品が見つかりませんでした。");
			}
		}

		return result;
	}


	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}
