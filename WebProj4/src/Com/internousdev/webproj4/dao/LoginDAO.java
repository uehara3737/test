package Com.internousdev.webproj4.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Com.internousdev.webproj4.dto.LoginDTO;
import Com.internousdev.webproj4.util.DBConnector;

public class LoginDAO {

public String username;
public String password;


public List<LoginDTO>loginDTOList=new ArrayList<LoginDTO>();
public List<LoginDTO>select(String username,String password){


	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select * from users where username=? and password=?";

	try{
		 PreparedStatement ps=con.prepareStatement(sql);
		 ps.setString(1,username);
		 ps.setString(2,password);
		 ResultSet rs=ps.executeQuery();


		 while(rs.next()){
			 LoginDTO dto=new LoginDTO();
			 dto.setUsername("該当なし");
			 dto.setPassword("該当なし");
			 loginDTOList.add(dto);

		 }


	}catch(SQLException e){
		e.printStackTrace();

	}
try{
	con.close();
	}catch(SQLException e){
		e.printStackTrace();

	}
return loginDTOList;

}








}
