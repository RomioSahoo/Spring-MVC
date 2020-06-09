package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.LoginStatusTransfer;
import com.model.Credentials;

public class UserDaoImpl implements UserDao{
	
	public LoginStatusTransfer getUser(Credentials  c)
	{
		//Getting the Connection to the database
		Connection con=DaoService.getConnection();
		String queryString=QueryConstants.QUERYSTRING;
		PreparedStatement pstmt=null;
		ResultSet result=null;
		//boolean match=false;
		LoginStatusTransfer transferObj=new LoginStatusTransfer();
		try
		{
			pstmt=con.prepareStatement(queryString);
			//Setting values for the input parameters
			pstmt.setString(1, c.getUsername());
			pstmt.setString(2, c.getPassword());
			result=pstmt.executeQuery();
			System.out.println("Query executed..");
			if(result.next())
				{
				transferObj.setFullName(result.getString(3));
				transferObj.setMatch(true);
				}
			
		
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}
		
		return transferObj;
	}

}
