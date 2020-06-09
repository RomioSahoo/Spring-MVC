package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.dto.LoginStatusTransfer;
import com.exceptions.InvalidCredentialsException;
import com.model.Credentials;

/**
 * Servlet implementation class LoginControllerServlet
 */
@WebServlet("/LoginController")
public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside LoginController");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//Creating the 'Credentials' object
		RequestDispatcher rd=null;
		Credentials c=new Credentials();
		c.setUsername(username);
		c.setPassword(password);
		UserDao ud=new UserDaoImpl();
		LoginStatusTransfer transferObj=ud.getUser(c);
		System.out.println(transferObj);
		if(transferObj.isMatch())
		{
		  request.setAttribute("LoginStatusTransfer",transferObj);
		   rd=request.getRequestDispatcher("Success.jsp");
		  rd.forward(request, response);
		}
		else
		{
			try
			{
			  throw new InvalidCredentialsException("Invalid username/password");
			}
			catch(InvalidCredentialsException ince)
			{
				//rd=request.getRequestDispatcher("Error.jsp");
				  //rd.forward(request, response);
				System.out.print("Invalid username/password");
			}
		}
		
	}

}






