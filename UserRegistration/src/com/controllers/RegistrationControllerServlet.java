package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.bo.UserBo;
import com.bo.UserBoImpl;
import com.model.Register;

/**
 * Servlet implementation class RegistrationControllerServlet
 */
@WebServlet("/RegistrationControllerL")
public class RegistrationControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(LoginControllerLogger.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationControllerServlet() {
		super();

	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Register reg = new Register();
		LOG.info("Registration Object created");
		System.out.println("Inside RegistrationController");
		String fullname = request.getParameter("fullname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		reg.setFullname(fullname);
		reg.setUsername(username);
		reg.setPassword(password);
		reg.setGender(gender);
		reg.setEmail(email);
		reg.setDob(dob);
		UserBo ub = new UserBoImpl();
		String name = ub.registerUser(fullname, username, password, gender, email, dob);
		if (name != null) {
			request.setAttribute("Name", name);
			LOG.info("The entered member details " + reg);
			RequestDispatcher rd = request.getRequestDispatcher("RegistrationSuccess.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("UserExist.jsp");
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
