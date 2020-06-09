package com.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.registration.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserBoImpl implements UserBo {

	@Override
	public int registerUser(String fullName, String address, String gender, String strDob, String password) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		Date dob = null;
		User user = null;
		int id=0;
		try {
			dob = sdf.parse(strDob);
			user = new User(fullName, address, gender, dob, password);
			//creating an object of userdaoimpl
			UserDao ud = new UserDaoImpl();
			id=ud.addUser(user);
			
		} catch (ParseException p) {
			p.printStackTrace();
		}
		//User  user=new User(fullName,address);
		// TODO Auto-generated method stub
		return id;
	}
}
