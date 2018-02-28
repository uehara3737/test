package com.uehara.Utv.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.uehara.Utv.DAO.ItemSearchDAO;
import com.uehara.Utv.DTO.AnimeDTO;

public class ItemSearchAction extends ActionSupport implements SessionAware {


	//検索ワード
	public String searchWord;
	public String message;
	public Map<String,Object> session;

	//検索結果格納リスト
	private List<AnimeDTO> animeDTOList=new ArrayList<AnimeDTO>();

	//検索結果の取得
	private ItemSearchDAO animeSearchDAO=new ItemSearchDAO();

//実行メソッド
	@SuppressWarnings("unchecked")
	public String execute(){
		String result=ERROR;

		//空白だったらエラーに！
		if(searchWord.equals("")){
			result=ERROR;
			animeDTOList=(List<AnimeDTO>)session.get("animeDTOList");
			setMessage("該当する商品が見つかりませんでした。");
		}else{


	animeDTOList=animeSearchDAO.getItemInfo(searchWord);

		if(animeDTOList.size()>0){
			session.put("animeList",animeDTOList);
			int itemCount=animeDTOList.size();
			String Count=Integer.toString(itemCount);
			setMessage(Count+"件の商品が見つかりました");
			result=SUCCESS;

		}else{
			result=ERROR;
			animeDTOList=(List<AnimeDTO>)session.get("animeDTO");
			setMessage("該当する商品がみつかりませんでした");


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

public List<AnimeDTO> getBuyAnimeDTOList(){
	return animeDTOList;
}

public void setAnimeDTOList(List<AnimeDTO> animeDTOList){
	this.animeDTOList=animeDTOList;
}
@Override
public void setSession(Map<String, Object> session){
	this.session=session;
}


}
