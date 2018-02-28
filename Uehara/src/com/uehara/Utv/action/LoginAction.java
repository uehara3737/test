package com.uehara.Utv.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.uehara.Utv.DAO.LoginDAO;
import com.uehara.Utv.DTO.LoginDTO;

public class LoginAction extends ActionSupport  implements SessionAware{
	//ログイン認証処理
	//Login.jspからログインID、ログインパスワードを受け取り
	// DBへ問い合わせを行います。

	private String loginNamejsp;
	private String loginPasswordjsp;
	private String result;
	public Map<String,Object> session;
	private LoginDTO loginDTO=new LoginDTO();
	private LoginDAO dao=new LoginDAO();
	//private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	//LoginDTOの中身
	//private String userId;
	//private String userPassword;
	//private String userName;
	//private boolean loginFlg=false;

	public String execute(){
		result=ERROR;

		loginDTO=dao.getLoginUserInfo(loginNamejsp,loginPasswordjsp);
		session.put("loginUser",loginDTO);

		if(loginDTO.getLoginFlg()){
			//if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;

		} else {
			result=ERROR;
		}

		return result;
	}

	public String getLoginNamejsp() {
		return loginNamejsp;
	}

	public void setLoginNamejsp(String loginNamejsp) {
		this.loginNamejsp = loginNamejsp;
	}

	public String getLoginPasswordjsp() {
		return loginPasswordjsp;
	}

	public void setLoginPasswordjsp(String loginPasswordjsp) {
		this.loginPasswordjsp = loginPasswordjsp;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}







}
