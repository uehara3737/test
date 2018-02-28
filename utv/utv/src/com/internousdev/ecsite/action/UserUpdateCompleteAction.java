package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserUpdateCompleteDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private UserUpdateCompleteDAO userUpdateCompleteDAO = new UserUpdateCompleteDAO();

	private LoginDTO loginDTO = new LoginDTO();

	public String execute() throws SQLException{

		String result = ERROR;

		String name =session.get("sex").toString();
		System.out.println(name);

		boolean checkUpdate =userUpdateCompleteDAO.userUpdateInfo (session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				session.get("userAddress").toString(),
				session.get("userAddress1").toString(),
				session.get("userAddress2").toString(),
				session.get("userAddress3").toString(),
				session.get("sex").toString(),
				session.get("tell").toString(),
				((LoginDTO) session.get("loginUser")).getUserNumber().toString());
		if(checkUpdate){
			result = SUCCESS;
		}

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
