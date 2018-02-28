package com.uehara.Utv.action;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.uehara.Utv.DAO.ToiawaseCompleteDAO;
public class ToiawaseCompleteAction extends ActionSupport{
public String toiawasejsp;

ToiawaseCompleteDAO dao=new ToiawaseCompleteDAO();
public String execute()throws SQLException{
	String ret=ERROR;
	dao.insert(toiawasejsp);
	ret=SUCCESS;

return ret;

}




}
