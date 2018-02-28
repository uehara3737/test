package com.uehara.Utv.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.uehara.Utv.DTO.AnimeDTO;
import com.uehara.Utv.util.DBConnector;

public class ItemSearchDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	private List<AnimeDTO> searchList = new ArrayList<AnimeDTO>();



	public List<AnimeDTO> getItemInfo(String searchWord){

		String sql = "SELECT * FROM anime_info";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				String animename = rs.getString("anime_title");
				String animetype = rs.getString("anime_type");

				if(animename.matches(searchWord) || animetype.matches(searchWord)){
					AnimeDTO dto = new AnimeDTO();
					dto.setAnimeName(animename);
					dto.setAnimeName(animetype);
					searchList.add(dto);
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}

		return searchList;
	}

	public List<AnimeDTO> getAnimeDTO(){
		return searchList;
	}


}
