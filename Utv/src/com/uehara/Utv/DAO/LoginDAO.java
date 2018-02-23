package com.uehara.Utv.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.uehara.Utv.DTO.LoginDTO;
import com.uehara.Utv.util.DBConnector;
public class LoginDAO {
	public String loginNamejsp;
	public String loginPasswordjsp;
	public String loginIdjsp;
	public String loginId1jsp;

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();

	public List<LoginDTO> loginDTOList=new ArrayList<LoginDTO>();

	public LoginDTO getLoginUserInfo(String loginNamejsp,String loginPasswordjsp){
		String sql="select * from user_info where user_name=? and user_password=?";
		//login.jsp のloginNamejspとloginPasswordjsp
		LoginDTO dto=new LoginDTO();

		try{
			dto.setLoginFlg(false);

			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,loginNamejsp);
			ps.setString(2,loginPasswordjsp);
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				dto.setLoginNamejsp(rs.getString("user_name"));
				dto.setUserPassword(rs.getString("user_password"));
				dto.setLoginIdjsp(rs.getString("user_id"));
				dto.setLoginId1jsp(rs.getString("user_id1"));
				dto.setDateUtil(rs.getString("insert_date"));
				dto.setLoginFlg(true);
			}

		}catch (Exception e){
			e.printStackTrace();
		}

		return dto;
	}

}

