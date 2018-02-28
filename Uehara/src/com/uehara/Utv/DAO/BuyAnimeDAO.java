package com.uehara.Utv.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.uehara.Utv.DTO.AnimeDTO;
import com.uehara.Utv.util.DBConnector;

//購入ボタンを押した後

public class BuyAnimeDAO {
private DBConnector db = new DBConnector();
 private Connection con = db.getConnection();
 private List<AnimeDTO> animeDTOList=new ArrayList<>();

 public List<AnimeDTO> getBuyAnimeinfo(){
	 String sql="select  anime_title,anime_setumei,anime_price,anime_kikan from anime_info";


	 try{
		 PreparedStatement ps=con.prepareStatement(sql);
		 ResultSet rs=ps.executeQuery();

		 while(rs.next()){
			 AnimeDTO dto=new  AnimeDTO();
			 dto.setAnimeName(rs.getString("anime_title"));
			 dto.setAnimeSetumei(rs.getString("anime_Setumei"));
			 dto.setAnimePrice(rs.getInt("anime_price"));
			 dto.setAnimeKikan(rs.getInt("anime_kikan"));
			 animeDTOList.add(dto);
		 }

	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 return animeDTOList;

 }



	public List<AnimeDTO> getAnimeDTO() {
		return animeDTOList;
	}


 }








