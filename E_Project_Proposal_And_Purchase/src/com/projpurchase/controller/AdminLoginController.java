package com.projpurchase.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.projpurchase.dao.AdminDao;
import com.projpurchase.dao.AdminDaoImpl;
import com.projpurchase.dto.LoginStatusTransfer;
import com.projpurchase.exceptions.InvalidCredentialsException;
import com.projpurchase.model.AdminCredentials;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLogin")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Line to map Logger
	private static final Logger LOG = Logger.getLogger(AdminLoginController.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLoginController() {
		super();

	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminCredentials credentials = new AdminCredentials();
		LOG.info("Credentials Object created");
		RequestDispatcher rd = null;

		System.out.println("Inside AdminLoginController");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		// Creating the 'AdminCredentials' object
		credentials.setEmail(email);
		credentials.setPassword(password);
		AdminDao admindao = new AdminDaoImpl();
		LoginStatusTransfer transferObj = admindao.getAdmin(credentials);
		System.out.println(transferObj);
		if (transferObj.isMatch()) {
			request.setAttribute("LoginStatusTransfer", transferObj);
			LOG.info("The entered member details " + credentials);
			rd = request.getRequestDispatcher("adminLoginSuccess.jsp");
			rd.forward(request, response);
		} else {
			try {
				throw new InvalidCredentialsException("Invalid username/password");
			} catch (InvalidCredentialsException ince) {
				rd = request.getRequestDispatcher("adminLoginError.jsp");
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
