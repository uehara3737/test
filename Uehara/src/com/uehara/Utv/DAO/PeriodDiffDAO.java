package com.uehara.Utv.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uehara.Utv.util.DBConnector;
import com.uehara.Utv.util.DateUtil;

public class PeriodDiffDAO{


public String now;


	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	DateUtil dateUtil = new DateUtil();

	//Date date=new Date();


	private String sql="SELECT PERIOD_DIFF(date_format(now(), '%Y%m'), date_format(insert_date, '%Y%m')) from user_info where id=?";

	public void createDate(String loginIdjsp)throws SQLException{
	try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,loginIdjsp);
			ps.execute();
	}


	catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();

	}
	}
	}


