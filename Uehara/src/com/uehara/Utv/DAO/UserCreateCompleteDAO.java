package com.uehara.Utv.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uehara.Utv.util.DBConnector;
import com.uehara.Utv.util.DateUtil;

public class UserCreateCompleteDAO {
private DBConnector db=new DBConnector();
private Connection con=db.getConnection();
private DateUtil dateUtil = new DateUtil();
private String sql="insert into user_info"
		+ "(user_id,user_id1,user_name,user_password,user_mail,user_yubin,user_yubin1,"
		+ "user_jusyo,user_tel,insert_date) values(?,?,?,?,?,?,?,?,?,cast(? as date))";

public void createUser(
		String loginIdjsp,
		String loginId1jsp,
		String loginNamejsp,
		String loginPasswordjsp,
		String loginMailjsp,
		String zip21,
		String zip22,
		String addr21,
		String loginTeljsp,
		String dateUtil) throws SQLException{

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, loginIdjsp);
		ps.setString(2, loginIdjsp);
		ps.setString(3, loginNamejsp);
		ps.setString(4, loginPasswordjsp);
		ps.setString(5, loginMailjsp);
		ps.setString(6, zip21);
		ps.setString(7, zip22);
		ps.setString(8, addr21);
		ps.setString(9, loginTeljsp);
		ps.setString(10,dateUtil);
		ps.execute();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();

}
}
}
