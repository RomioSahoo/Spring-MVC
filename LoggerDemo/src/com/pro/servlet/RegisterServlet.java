package com.pro.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.pro.model.InvalidMobileNumberException;
import com.pro.model.Member;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Line to map Logger
	private static final Logger LOG=Logger.getLogger(RegisterServlet.class);
    private boolean flag=true;
	public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Member member=new Member(); 
    	LOG.info("member Object created");
    	RequestDispatcher rd=null;
   	try
   	{    		   	
    		member.setFname(request.getParameter("fname"));
    		member.setLname(request.getParameter("lname"));
    		member.setEmail(request.getParameter("email"));
    	
    	if(request.getParameter("mobile").length()==10)
    	{
    		member.setMobile(request.getParameter("mobile"));
    	}
    	else
    	{	member.setMobile("-");
    		throw new InvalidMobileNumberException("Mobile number not of valid length");
    	}    	
    		
    }
   	catch(InvalidMobileNumberException imne)
   	{
   		flag=false;
   		LOG.error(imne.getMessage());
   		rd=request.getRequestDispatcher("error.jsp");
   		request.setAttribute("message",imne.getMessage());
   		rd.forward(request,response);  		
    		
    }
   		if(flag)
   		{
   			flag=false;
   			LOG.info("The entered member details "+member);
   			rd=request.getRequestDispatcher("success.jsp");
   			request.setAttribute("member",member);
   			rd.forward(request,response);  
   		}	
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
