package com.projpurchase.constants;

public class QueryConstants {
	public static final String QUERYSTRING1 = "select first_name,email,password from admin where email=? and password=?";
	public static final String QUERYSTRING2 = "insert into admin values(?,?,?,?,?)";
}
