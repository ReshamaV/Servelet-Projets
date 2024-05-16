

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object user="servlet";
	private Object pwd="jsp@123";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userID = request.getParameter("user");
		String password = request.getParameter("pwd");
		
		if(userID.equals(user) && password.equals(pwd)){
			RequestDispatcher rd = request.getRequestDispatcher("Welcomeservlet");
			rd.forward(request,response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Enter userID and Password.</font>");
			rd.include(request, response);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		String n=request.getParameter("user");
		if(userID.equals(user) && password.equals(pwd)){
			Cookie loginCookie = new Cookie("user",user);
			response.addCookie(loginCookie);
			RequestDispatcher rd=
			response.sendRedirect("Welcome.jsp");
		}else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.jsp");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Enter userID and Password.</font>");
			rd.include(request, response);
			doGet(request,response);
	}*/
	

}
