package com.projpurchase.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.projpurchase.bo.AdminBO;
import com.projpurchase.bo.AdminBoImpl;
import com.projpurchase.model.AdminRegistration;

/**
 * Servlet implementation class AdminRegisterController
 */
@WebServlet("/AdminRegister")
public class AdminRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Line to map Logger
	private static final Logger LOG = Logger.getLogger(AdminLoginController.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminRegisterController() {
		super();

	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminRegistration register = new AdminRegistration();
		LOG.info("Registration Object created");
		System.out.println("Inside RegistrationController");
	
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String contactNumber=request.getParameter("contactNumber");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		register.setFirstName(firstName);
		register.setLastName(lastName);
		register.setContactNumber(contactNumber);
		register.setEmail(email);
		register.setPassword(password);
		AdminBO adminbo = new AdminBoImpl();
		String name=adminbo.registerAdmin(firstName, lastName, contactNumber, email, password);
		if (name != null) {
			request.setAttribute("Name", name);
			LOG.info("The entered member details " + register);
			RequestDispatcher rd = request.getRequestDispatcher("adminRegistrationSuccess.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("adminExist.jsp");
			rd.forward(request, response);
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
