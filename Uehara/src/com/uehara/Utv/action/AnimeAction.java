package com.uehara.Utv.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.uehara.Utv.DAO.AnimeDAO;
import com.uehara.Utv.DTO.AnimeDTO;
public class AnimeAction extends ActionSupport implements SessionAware {

List<AnimeDTO>animeDTOList=new ArrayList<AnimeDTO>();
Map<String,Object>session;
AnimeDTO animeDTO=new AnimeDTO();


public String animeName;
public int id;
public int animePrice;
public int animeKikan;
public String  animeType;
public String animeSetumei;


public String execute(){
	String ret=ERROR;

	AnimeDAO animeDAO=new AnimeDAO();
	animeDTOList=animeDAO.select();
	session.put("animeDTOList",animeDTOList);
	session.put("id",animeDTO.getId());
	session.put("animePrice", animeDTO.getAnimePrice());
	session.put("animeKikan",animeDTO.getAnimeKikan());
	session.put("animeName", animeDTO.getAnimeName());
	session.put("animeType", animeDTO.getAnimeType());
    session.put("animeSetumei",animeDTO.getAnimeSetumei());

	ret=SUCCESS;

return ret;

}

public String getAnimeName() {
	return animeName;
}
public void setAnimeName(String animeName) {
	this.animeName = animeName;
}

//アニメプライス
public int getAnimePrice() {
	return animePrice;
}
public void setAnimePrice(int animePrice) {
	this.animePrice = animePrice;
}


//アニメID
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


//アニメカテゴリー
public String getAnimeType() {
	return animeType;
}
public void setAnimeType(String animeType) {
	this.animeType = animeType;
}


//アニメの説明
public String getAnimeSetumei() {
	return animeSetumei;
}

public void setAnimeSetumei(String animeSetumei) {
	this.animeSetumei = animeSetumei;
}


public int getAnimeKikan() {
	return animeKikan;
}
public void setAnimeKikan(int animeKikan) {
	this.animeKikan = animeKikan;
}



public Map<String, Object> getSession() {
return session;
}

public void setSession(Map<String, Object> session) {
this.session = session;
}
}
