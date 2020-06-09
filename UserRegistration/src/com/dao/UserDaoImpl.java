package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.LoginStatusTransfer;
import com.dto.LoginStatusTransferEmail;
import com.model.Credentials;
import com.model.Register;

public class UserDaoImpl implements UserDao {

	public LoginStatusTransfer getUser(Credentials c) {
		// Getting the Connection to the database
		Connection con1 = DaoService.getConnection();
		String queryString1 = QueryConstants.QUERYSTRING1;
		PreparedStatement pstmt = null;
		ResultSet result1 = null;
		LoginStatusTransfer transferObj = new LoginStatusTransfer();
		try {
			pstmt = con1.prepareStatement(queryString1);
			// Setting values for the input parameters
			pstmt.setString(1, c.getUsername());
			pstmt.setString(2, c.getPassword());
			// executing query
			result1 = pstmt.executeQuery();
			if (result1.next()) {
				transferObj.setFullName(result1.getString("full_name"));
				transferObj.setMatch(true);
			}

		} catch (SQLException sql) {
			sql.printStackTrace();
		}

		return transferObj;
	}

	public LoginStatusTransferEmail getPass(Credentials c) {
		// Getting the Connection to the database
		Connection con2 = DaoService.getConnection();
		String queryString2 = QueryConstants.QUERYSTRING2;
		PreparedStatement pstmt = null;
		ResultSet result2 = null;

		LoginStatusTransferEmail transferObj1 = new LoginStatusTransferEmail();
		try {
			pstmt = con2.prepareStatement(queryString2);
			pstmt.setString(1, c.getEmail());
			// executing query
			result2 = pstmt.executeQuery();
			if (result2.next()) {

				transferObj1.setPassword(result2.getString("password"));
				transferObj1.setEmatch(true);
			}

		} catch (SQLException sql) {
			sql.printStackTrace();
		}

		return transferObj1;
	}

	@Override
	public int addUser(Register reg) {
		Connection con = DaoService.getConnection();
		String insertString = QueryConstants.QUERYSTRING3;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			pstmt = con.prepareStatement(insertString);
			pstmt.setString(1, reg.getFullname());
			pstmt.setString(2, reg.getUsername());
			pstmt.setString(3, reg.getPassword());
			pstmt.setString(4, reg.getGender());
			pstmt.setString(5, reg.getEmail());
			pstmt.setString(6, reg.getDob());
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
