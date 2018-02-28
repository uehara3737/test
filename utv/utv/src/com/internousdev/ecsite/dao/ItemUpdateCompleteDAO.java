package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemUpdateCompleteDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private DateUtil dateUtil=new DateUtil();

	private String sql="UPDATE item_info_transaction SET item_name = ?, item_price = ?, item_stock = ?, update_date = ? WHERE id = ?";

	public void itemUpdateInfo(String item_name, String item_price, String item_stock, int id) throws SQLException{

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_name);
			ps.setString(2, item_price);
			ps.setString(3, item_stock);
			ps.setString(4, dateUtil.getDate());
			ps.setInt(5, id);

			ps.executeUpdate();
		}catch(Exception  e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
