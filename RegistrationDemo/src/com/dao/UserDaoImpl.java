package com.dao;

import com.registration.User;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class UserDaoImpl implements UserDao {
	public int addUser(User user) {
//creating an object of FileWriter
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("d:/users.txt",true);
			bw = new BufferedWriter(fw);
			String record = user.getId() + "," + user.getName() + "," + user.getAddress() + "," + user.getGender() + ","
					+ user.getDob() + "," + user.getPassword();
			bw.write(record);
			bw.newLine();
			//return 0;
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e) {

			}
		}
		return user.getId();
	}
}