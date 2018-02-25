package com.uehara.Utv.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.uehara.Utv.DAO.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {
	private String loginIdjsp;
	private String loginId1jsp;
	private String loginNamejsp;
	private String loginPasswordjsp;
	private String loginMailjsp;
	private String zip21;
	private String zip22;
	private String addr21;
	private String loginTeljsp;
	public String dateUtil;

public Map<String,Object>session;
private String result;

private UserCreateCompleteDAO completeDAO=new UserCreateCompleteDAO();



public String execute() throws SQLException{
	completeDAO.createUser(
			session.get("loginIdKey").toString(),
			session.get("loginId1Key").toString(),
			session.get("loginNameKey").toString(),
			session.get("loginPasswordKey").toString(),
			session.get("loginMailKey").toString(),
			session.get("zip21Key").toString(),
			session.get("zip22Key").toString(),
			session.get("addr21Key").toString(),
			session.get("loginTelKey").toString(),
			session.get("dateUtilKey").toString());
result=SUCCESS;
return result;
}


//PeriodDiffDAO perioodDAO=new PeriodDiffDAO();
//perioodDAO.createDate(Strin)

















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
@Override
public void setSession(Map<String, Object> session) {
	this.session = session;
}

}

