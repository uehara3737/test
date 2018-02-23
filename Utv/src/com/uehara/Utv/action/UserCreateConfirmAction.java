package com.uehara.Utv.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.uehara.Utv.util.DateUtil;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginIdjsp;
	private String loginId1jsp;
	private String loginNamejsp;
	private String loginPasswordjsp;
	private String loginMailjsp;
	private String zip21;
	private String zip22;
	private String addr21;
	private String loginTeljsp;
	public String date;

	public Map<String,Object> session;
	private String result;
	private String errorMessage;

	public String execute(){
		result=SUCCESS;

		DateUtil dateUtil = new DateUtil();
		date = dateUtil.getDate();

//もし、ログイン名とログインパスワードが空じゃなかったら、セッションプット！

		if(!(loginNamejsp.equals(""))&&!(loginPasswordjsp.equals(""))){
			//&&!(loginIdjsp.equals(""))&&!(loginId1jsp.equals(""))&&!(loginMailjsp.equals(""))
			session.put("loginIdKey",loginIdjsp);//姓
			session.put("loginId1Key",loginId1jsp);//名
			session.put("loginNameKey",loginNamejsp);//	アカウント名
			session.put("loginPasswordKey", loginPasswordjsp);//パスワード
			session.put("loginMailKey",loginMailjsp);//メール
			session.put("zip21Key",zip21);//郵便番号３桁
			session.put("zip22Key",zip22);//郵便番号４桁
			session.put("addr21Key",addr21);//住所
			session.put("loginTelKey",loginTeljsp);//電話番号
			session.put("dateUtilKey", date);//登録日


		}else{//空だったら、エラーメッセージを出す
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
		return result;
	}

	//Id
	public String getLoginIdjsp() {
		return  loginIdjsp;
	}

	public void setLoginIdjsp(String  loginIdjsp) {
		this. loginIdjsp =  loginIdjsp;
	}
	//Id1
	public String getLoginId1jsp() {
		return loginId1jsp;
	}

	public void setLoginId1jsp(String loginId1jsp) {
		this.loginId1jsp = loginId1jsp;
	}
//Name
	public String getLoginNamejsp() {
		return loginNamejsp;
	}

	public void setLoginNamejsp(String loginNamejsp) {
		this.loginNamejsp = loginNamejsp;
	}
	//Password
	public String getLoginPasswordjsp() {
		return loginPasswordjsp;
	}

	public void setLoginPasswordjsp(String loginPasswordjsp) {
		this.loginPasswordjsp = loginPasswordjsp;
	}
	//Mail
	public String getLoginMailjsp() {
		return loginMailjsp;
	}

	public void setLoginMailjsp(String loginMailjsp) {
		this.loginMailjsp = loginMailjsp;
	}

	//zip21
	public String getZip21() {
		return zip21;
	}

	public void setZip21(String zip21) {
		this.zip21 = zip21;
	}

	//zip22
	public String getZip22() {
		return zip22;
	}

	public void setZip22(String zip22) {
		this.zip22 = zip22;
	}
	//addr21
	public String getAddr21() {
		return addr21;
	}

	public void setAddr21(String addr21) {
		this.addr21 = addr21;
	}
	//Tel
	public String getLoginTeljsp() {
		return loginTeljsp;
	}

	public void setLoginTeljsp(String loginTeljsp) {
		this.loginTeljsp = loginTeljsp;
	}

	//日付

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}









}
