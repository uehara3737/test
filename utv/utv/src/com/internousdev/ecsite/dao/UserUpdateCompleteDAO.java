package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserUpdateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql ="UPDATE login_user_transaction SET login_id = ?, login_pass = ?, user_name = ?, user_address = ?, user_address1 = ?, user_address2 = ?, user_address3 = ?, user_sex = ?, user_tell = ?, updated_date = ? WHERE id = ?";

	public boolean userUpdateInfo(String login_id, String login_pass, String user_name,
			String user_address, String user_address1, String user_address2, String user_address3,
			String user_sex, String user_tell, String defaultLoginId) throws SQLException{

		boolean result = false;

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, login_id);
			preparedStatement.setString(2, login_pass);
			preparedStatement.setString(3, user_name);
			preparedStatement.setString(4, user_address);
			preparedStatement.setString(5, user_address1);
			preparedStatement.setString(6, user_address2);
			preparedStatement.setString(7, user_address3);
			preparedStatement.setString(8, user_sex);
			preparedStatement.setString(9, user_tell);
			preparedStatement.setString(10, dateUtil.getDate());
			preparedStatement.setString(11, defaultLoginId);

			int checkUpdate = preparedStatement.executeUpdate();

			if(checkUpdate > 0){
				result = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;


	}
}
