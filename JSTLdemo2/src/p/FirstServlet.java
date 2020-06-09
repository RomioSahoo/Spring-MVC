package p;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String name = request.getParameter("userName");  
		 String city=request.getParameter("city");
		 request.setAttribute("name", name);      
		 request.setAttribute("city",city);
		 RequestDispatcher dispatcher = request.getRequestDispatcher("jstl-demo.jsp");  
		 if (dispatcher != null)
		 {    
			 dispatcher.forward(request, response);  
		 } 
	}

}
