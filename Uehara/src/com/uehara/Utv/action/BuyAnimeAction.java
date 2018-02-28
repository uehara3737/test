package com.uehara.Utv.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.uehara.Utv.DTO.AnimeDTO;
public class BuyAnimeAction extends ActionSupport implements SessionAware {

private ArrayList <AnimeDTO> animeDTOList=new ArrayList<>();

//アニメ購入個数 （anime.jspのレンタル期間のセレクトタブと同じ名前）
private List<String> animeCount;

//支払い方法　(anime_rireki　のデータベースに保存）
private int pay;

//アニメ情報を格納
public Map<String,Object>session;

//アニメ情報取得メソッド
public String execute(){
	String result=SUCCESS;

	//AnimeActionで保管した、animeDTOListを使いたい。
	//★AnimeActionの中身→session.put("animeDTOList",animeDTOList);
	//このanimeDTOListには、データベースからインサートしてきた、animeの情報が入っている。

	session.put("animeCount", animeCount);
	@SuppressWarnings("unchecked")
	List<AnimeDTO> list= (List<AnimeDTO>) session.get("animeDTOList");

	/* ここから繰り返したい */
	/**
	 * List型
	 * 値取得 : .get(添え字);
	 * サイズ取得 : .size();
	 */
	/** ここから合計金額を計算する処理 */

for(int i=0;i<animeCount.size();i++){
	AnimeDTO animeDTO=new AnimeDTO();

	String animeName=list.get(i).getAnimeName();
	session.put("animeName",animeName);

	int animePrice=list.get(i).getAnimePrice();
	session.put("animePrice",animePrice);

	//int animeCount=list.get(i).getAnimeCount();
	//session.put("animeCount",animeCount);

int intCount=Integer.parseInt(animeCount.get(i));
//int intPrice=Integer.parseInt(list.get(i).getAnimePrice());

if(intCount !=0){

}
}

}//














}
