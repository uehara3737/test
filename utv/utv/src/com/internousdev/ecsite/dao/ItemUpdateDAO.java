package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemUpdateDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private List<BuyItemDTO> list=new ArrayList<BuyItemDTO>();

	String sql="SELECT * FROM item_info_transaction where id = ?";

	public List<BuyItemDTO> itemUpdateInfo(int id){

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				BuyItemDTO dto=new BuyItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				list.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

		return list;
	}
}
