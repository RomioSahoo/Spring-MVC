package com.dao;

public class QueryConstants {

	public static final String QUERYSTRING1 = "select username,password,full_name from users where username=? and password=?";
	public static final String QUERYSTRING2 = "select email,password from users where email=?";
	public static final String QUERYSTRING3 = "insert into users values(?,?,?,?,?,?)";

}
