package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.dto.LoginStatusTransfer;
import com.exceptions.InvalidCredentialsException;
import com.model.Credentials;

/**
 * Servlet implementation class LoginControllerLogger
 */
@WebServlet("/LoginControllerLogger")
public class LoginControllerLogger extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Line to map Logger
	private static final Logger LOG = Logger.getLogger(LoginControllerLogger.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginControllerLogger() {
		super();

	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Credentials cm = new Credentials();
		LOG.info("Credentials Object created");
		RequestDispatcher rd = null;

		System.out.println("Inside LoginController");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// Creating the 'Credentials' object

		cm.setUsername(username);
		cm.setPassword(password);
		UserDao ud = new UserDaoImpl();
		LoginStatusTransfer transferObj = ud.getUser(cm);
		System.out.println(transferObj);
		if (transferObj.isMatch()) {
			request.setAttribute("LoginStatusTransfer", transferObj);
			LOG.info("The entered member details " + cm);
			rd = request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		} else {
			try {
				throw new InvalidCredentialsException("Invalid username/password");
			} catch (InvalidCredentialsException ince) {
				rd = request.getRequestDispatcher("Error.jsp");
				rd.forward(request, response);

			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

}
