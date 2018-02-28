package com.uehara.Utv.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.uehara.Utv.DTO.AnimeDTO;
import com.uehara.Utv.util.DBConnector;
public class AnimeDAO {


	List<AnimeDTO> animeDTOList = new ArrayList<AnimeDTO>();
	public List<AnimeDTO> select() {
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();



	String sql="select anime_id,anime_title,anime_setumei,anime_type,anime_price from anime_info";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				AnimeDTO animeDTO = new AnimeDTO();
				animeDTO.setId(rs.getInt("anime_id"));
				animeDTO.setAnimeName(rs.getString("anime_title"));
				animeDTO.setAnimeSetumei(rs.getString("anime_setumei"));
				animeDTO.setAnimeType(rs.getString("anime_type"));
				animeDTO.setAnimePrice(rs.getInt("anime_price"));

				animeDTOList.add(animeDTO);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}

		return animeDTOList;

	}


	}