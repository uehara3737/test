package com.uehara.Utv.DTO;

public class BuyAnimeDTO {
public String animeName;
public String animePrice;
public String animeCount;
public String animeLike;

//アニメタイトル
public String getAnimeName() {
	return animeName;
}
public void setAnimeName(String animeName) {
	this.animeName = animeName;
}

//アニメプライス
public String getAnimePrice() {
	return animePrice;
}
public void setAnimePrice(String animePrice) {
	this.animePrice = animePrice;
}


//アニメ お気に入り
public String getAnimeLike() {
	return animeLike;
}
public void setAnimeLike(String animeLike) {
	this.animeLike = animeLike;
}


//アニメカウント
public String getAnimeCount() {
	return animeCount;
}
public void setAnimeCount(String animeCount) {
	this.animeCount = animeCount;
}




}
