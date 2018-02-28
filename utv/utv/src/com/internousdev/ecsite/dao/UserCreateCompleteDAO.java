package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name, insert_date, user_address, user_address1, user_address2, user_address3, user_sex, user_tell) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public void createUser(String loginUserId, String loginUserPassword, String userName, String userAddress, String userAddress1, String userAddress2, String userAddress3, String userSex, String userTell) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, dateUtil.getDate());
			preparedStatement.setString(5, userAddress);
			preparedStatement.setString(6, userAddress1);
			preparedStatement.setString(7, userAddress2);
			preparedStatement.setString(8, userAddress3);
			preparedStatement.setString(9, userSex);
			preparedStatement.setString(10, userTell);

			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
