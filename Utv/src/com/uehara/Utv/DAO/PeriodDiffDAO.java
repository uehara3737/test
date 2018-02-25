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




	private String sql="select period_diff(?,?)";

	public void createDate(String now,String date)throws
	SQLException{


	try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,now);
			ps.setString(2,dateUtil.getDate());
			ps.execute();
	}


	catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();

	}
	}
	}


