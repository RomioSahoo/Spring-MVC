package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.LoginStatusTransfer;
import com.exceptions.*;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet("/FrontController")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Front Controller...");
		String actionType=request.getParameter("actionType");
		boolean match=false;
		RequestDispatcher rd=null;
		if(actionType.equals("1"))
		{
		   rd=request.getRequestDispatcher("Login.html");
		 //  System.out.println("Will");
		   rd.forward(request, response);
		   /*System.out.println("Returned from LoginController");
		   LoginStatusTransfer transferObj=(LoginStatusTransfer)request.getAttribute("LoginStatusTransfer");
		   System.out.println(transferObj);
		   if(transferObj.isMatch())
		   {
			   rd=request.getRequestDispatcher("Success.jsp");
			   String fullName=(String)request.getAttribute("fullName");
			   request.setAttribute("fullName", fullName);
			   rd.forward(request, response);
		   }
		   else
		   {
			 try
			 {
			   throw new InvalidCredentialsException("Invalid username/password..") ; 
			 }
			 catch(InvalidCredentialsException inve)
			 {
				 rd=request.getRequestDispatcher("Error.jsp");
				 rd.include(request, response);
			 }
			   
		   }
		   */
		   
	}
	}
}
