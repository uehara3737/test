package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemDeleteCompleteDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private String sql="DELETE FROM item_info_transaction WHERE item_name = ?";

	public void itemDeleteInfo(String name) throws SQLException{

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
