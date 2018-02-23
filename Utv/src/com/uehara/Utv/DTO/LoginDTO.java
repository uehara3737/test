package com.uehara.Utv.DTO;

public class LoginDTO {
	private String userId;
	private String loginNamejsp;
	private String loginPasswordjsp;
	private String loginIdjsp;
	private String loginId1jsp;
	private String dateUtil;
	private boolean loginFlg=false;


	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}

//loginPassword
	public String getLoginPasswordjsp(){
		return loginPasswordjsp;
	}

	public void setUserPassword(String loginPasswordjsp){
		this.loginPasswordjsp=loginPasswordjsp;
	}

	//loginName
	public String getLoginNamejsp(){
		return loginNamejsp;
	}

	public void setLoginNamejsp(String loginNamejsp){
		this.loginNamejsp=loginNamejsp;
	}



//loginId
	public String getLoginIdjsp(){
		return loginIdjsp;
	}

	public void setLoginIdjsp(String loginIdjsp){
		this.loginIdjsp=loginIdjsp;
	}


//loginId1
	public String getLoginId1jsp(){
		return loginId1jsp;
	}

	public void setLoginId1jsp(String loginId1jsp){
		this.loginId1jsp=loginId1jsp;
	}

//insert_date
	public String getDateUtil(){
		return dateUtil;
	}

	public void setDateUtil(String dateUtil){
		this.dateUtil=dateUtil;
	}

	//loginFlg

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}


}
