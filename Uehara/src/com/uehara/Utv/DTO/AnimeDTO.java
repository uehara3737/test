package com.uehara.Utv.DTO;

public class AnimeDTO {
public int id;
public int animePrice;
public int animeKikan;
public int animeCount;
public String animeName;
public String animeSetumei;
public String animeType;
public String animeLike;

//total
public int totalPrice;
public int totalCount;
public String pay;


//アニメID
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


//アニメプライス
public int getAnimePrice() {
	return animePrice;
}
public void setAnimePrice(int animePrice) {
	this.animePrice = animePrice;
}


//アニメの配信期間
public int getAnimeKikan() {
	return animeKikan;
}
public void setAnimeKikan(int animeKikan) {
	this.animeKikan = animeKikan;
}


//アニメカウント
public int getAnimeCount() {
	return animeCount;
}
public void setAnimeCount(int animeCount) {
	this.animeCount = animeCount;
}


//アニメタイトル
public String getAnimeName() {
	return animeName;
}
public void setAnimeName(String animeName) {
	this.animeName = animeName;
}


//アニメの説明
public String getAnimeSetumei() {
	return animeSetumei;
}
public void setAnimeSetumei(String animeSetumei) {
	this.animeSetumei = animeSetumei;
}


//アニメカテゴリー
public String getAnimeType() {
	return animeType;
}
public void setAnimeType(String animeType) {
	this.animeType = animeType;
}


//アニメ お気に入り
public String getAnimeLike() {
	return animeLike;
}
public void setAnimeLike(String animeLike) {
	this.animeLike = animeLike;
}


//支払い
public String getPay() {
	return pay;
}
public void setPay(String pay) {
	this.pay = pay;
}


//トータルカウント　カートに入れた後
public int getTotalCount() {
	return totalCount;
}
public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
}


//トータルプライス
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}


}











