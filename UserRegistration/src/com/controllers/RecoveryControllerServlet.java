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
//import com.dto.LoginStatusTransfer;
import com.dto.LoginStatusTransferEmail;
import com.exceptions.InvalidCredentialsException;
import com.model.Credentials;

/**
 * Servlet implementation class RecoveryControllerServlet
 */
@WebServlet("/RecoveryController")
public class RecoveryControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecoveryControllerServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		// Creating the 'Credentials' object
		RequestDispatcher rd = null;
		Credentials c = new Credentials();
		c.setEmail(email);
		UserDao ud = new UserDaoImpl();
		LoginStatusTransferEmail transferObj1 = ud.getPass(c);
		System.out.println(transferObj1);
		if (transferObj1.isEmatch()) {
			request.setAttribute("LoginStatusTransferEmail", transferObj1);
			rd = request.getRequestDispatcher("SuccessEmail.jsp");
			rd.forward(request, response);
		} else {
			try {
				throw new InvalidCredentialsException("Invalid email");
			} catch (InvalidCredentialsException ince) {
				rd = request.getRequestDispatcher("ErrorEmail.jsp");
				rd.forward(request, response);

			}
		}
	}

}
