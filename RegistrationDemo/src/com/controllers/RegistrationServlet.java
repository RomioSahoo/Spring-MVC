package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.UserBo;
import com.bo.UserBoImpl;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationController")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegistrationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//retrieving the request parameter values
		String fullName=request.getParameter("fullName");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String strDob=request.getParameter("dob");
		String password=request.getParameter("password");
		/*PrintWriter out=response.getWriter();
		out.print("FullName :" +fullName+"<br>");
		out.print("Address :" +address+"<br>");
		out.print("Gender :" +gender+"<br>");
		out.print("DOB :" +strDob+"<br>");
		out.print("Password :" +password+"<br>");*/
		//creating an object of userBoImpl.
		UserBo ub=new UserBoImpl();
		int id=ub.registerUser(fullName,address,gender,strDob,password);
		//setting id as a request.attribute
		request.setAttribute("userid", id);
		//creating request dispatches object to dispatch 
		//the request to success.jsp
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		//Dispatch the request
		rd.forward(request,response);
	}

}
