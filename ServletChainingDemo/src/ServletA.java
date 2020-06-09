

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */
@WebServlet("/A")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletA() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Creating a RequestDispatcher object for dispatching the request
		//to next servlet in the chain
		RequestDispatcher hd=request.getRequestDispatcher("B");
		PrintWriter out=response.getWriter();
		out.print("<h2>Inside A and heading toward B</h2>");
		//Forward the request to B
		hd.forward(request, response);
		out.print("<h2>Have returned from B</h2><br>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

}
