package com.projpurchase.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.projpurchase.constants.QueryConstants;
import com.projpurchase.dto.LoginStatusTransfer;
import com.projpurchase.model.AdminCredentials;
import com.projpurchase.model.AdminRegistration;
import com.projpurchase.util.DbUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public LoginStatusTransfer getAdmin(AdminCredentials ac) {
		// Getting the Connection to the database
		Connection con1 = DbUtil.getConnection();
		String queryString1 = QueryConstants.QUERYSTRING1;
		PreparedStatement pstmt = null;
		ResultSet result1 = null;
		LoginStatusTransfer transferObj = new LoginStatusTransfer();
		try {
			pstmt = con1.prepareStatement(queryString1);
			// Setting values for the input parameters
			pstmt.setString(1, ac.getEmail());
			pstmt.setString(2, ac.getPassword());
			// executing query
			result1 = pstmt.executeQuery();
			if (result1.next()) {
				transferObj.setFirstName(result1.getString("first_name"));
				transferObj.setMatch(true);
			}

		} catch (SQLException sql) {
			sql.printStackTrace();
		}

		return transferObj;
	}

	public int addAdmin(AdminRegistration ar) {
		Connection con = DbUtil.getConnection();
		String insertString = QueryConstants.QUERYSTRING2;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			pstmt = con.prepareStatement(insertString);
			pstmt.setString(1, ar.getFirstName());
			pstmt.setString(2, ar.getLastName());
			pstmt.setString(3, ar.getContactNumber());
			pstmt.setString(4, ar.getEmail());
			pstmt.setString(5, ar.getPassword());
			n = pstmt.executeUpdate();

		} catch (SQLException sql) {
			sql.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException sql) {
			}

		}
		return n;
	}

}
