package com.uehara.Utv.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uehara.Utv.util.DBConnector;

public class ToiawaseCompleteDAO {
	public void insert(String toiawasejsp) throws SQLException{
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	String sql="insert into user_toiawase(user_text)values(?)";




		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, toiawasejsp);
			ps.execute();}
			catch(Exception e){
				e.printStackTrace();
			}finally{
				con.close();
			}
		}
}