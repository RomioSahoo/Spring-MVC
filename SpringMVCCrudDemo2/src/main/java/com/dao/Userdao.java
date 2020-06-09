package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.beans.User;

public class Userdao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<User> getUser() {

		return template.query(
				"select account_master.acc_num,account_master.name,acc_transaction.acc_num, acc_transaction.dot, acc_transaction.type ,acc_transaction.trans_amt from acc_transaction inner join account_master on acc_transaction.acc_num=account_master.acc_num",
				new ResultSetExtractor<List<User>>() {

					public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {

						List<User> list = new ArrayList<User>();
						while (rs.next()) {
							User user = new User();
							user.setAcc_num(rs.getInt(1));
							user.setName(rs.getString(2));
							user.setDot(rs.getString(3));
							user.setType(rs.getString(4));
							user.setTrans_amt(rs.getString(5));
							list.add(user);
						}
						//System.out.println(list);
						return list;
					}
				});

	}

}
