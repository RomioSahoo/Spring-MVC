package com.projpurchase.bo;

import com.projpurchase.dao.AdminDaoImpl;
import com.projpurchase.model.AdminRegistration;

public class AdminBoImpl implements AdminBO {

	@Override
	public String registerAdmin(String firstName, String lastName, String contactNumber, String email,
			String password) {
		// Creating object of AdminRegistration class
		AdminRegistration registration = new AdminRegistration(firstName, lastName, contactNumber, email, password);
		AdminDaoImpl admindao = new AdminDaoImpl();
		int n = admindao.addAdmin(registration);
		if (n == 1) {
			return firstName;
		} else {
			return null;
		}

	}

}
