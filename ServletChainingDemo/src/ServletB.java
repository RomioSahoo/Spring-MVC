

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletB
 */
@WebServlet("/B")
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletB() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher hd=request.getRequestDispatcher("C");
		PrintWriter out=response.getWriter();
		out.print("<h2>Inside B and heading toward C</h2>");
		//Forward the request to B
		hd.forward(request, response);
		out.print("<h2>Have returned from C</h2><br>");
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
