package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private boolean result =false;

	public Map<String, Object> session;

	public boolean getUserInfo(String loginUserId, String loginPassword){

		String sql="SELECT * FROM login_user_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){

				String loginId = resultSet.getString("login_id");
				String password = resultSet.getString("login_pass");

				if(loginId.equals(loginUserId) || password.equals(loginPassword)){

					if(loginId.equals(loginUserId)){
						result = false;
						return result;
					}else{
						result = true;
					}

				}else{
					result = true;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return result;
	}



	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}
