package com.bo;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.Register;

public class UserBoImpl implements UserBo {

	@Override
	public String registerUser(String fullname, String username, String password, String gender, String email,
			String dob) {
		// Creating object of Register class
		Register reg = new Register(fullname, username, password, gender, email, dob);
		UserDao ud = new UserDaoImpl();
		int n = ud.addUser(reg);
		if (n == 1) {
			return fullname;
		} else {
			return null;
		}

	}

}
