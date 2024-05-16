

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcomeservlet
 */
@WebServlet("/Welcomeservlet")
public class Welcomeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object user;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcomeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	String n=request.getParameter("uname"); 
    	response.sendRedirect("Welcome1.jsp");
	}
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	response.setContentType("text/html");
    	Cookie loginCookie = null;
    	Cookie[] cookies = request.getCookies();
    	if(cookies != null){
    	for(Cookie cookie : cookies){
    		if(cookie.getName().equals("user")){
    			loginCookie = cookie;
    			break;
    		}
    	}
    	}
    	if(loginCookie != null){
    		loginCookie.setMaxAge(0);
        	response.addCookie(loginCookie);
    	}
    	response.sendRedirect("Login.jsp");
    }
	}*/
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	String user=request.getParameter("user"); 
    	//String p=request.getParameter("pwd");
    //	HttpSession session=request.getSession();
    	//session.getAttribute("user");
    //	request.setAttribute("user",user);
    	RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
    	//response.sendRedirect("Welcome.jsp"+user);
    	rd.forward(request, response);
	}
}


