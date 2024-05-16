

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import org.omg.CORBA.portable.InputStream;

/**
 * Servlet implementation class PDFfile
 */
@WebServlet("/PDFfile")
public class PDFfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PDFfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 String filename = "C:\\Users\\ReshamaV\\Downloads\\Helloworld.pdf";

	        ServletContext context = getServletContext();
	        InputStream is =  (InputStream) context.getResourceAsStream(filename);
	        if (is != null) {
	            InputStreamReader isr = new InputStreamReader(is);
	            BufferedReader reader = new BufferedReader(isr);
	            PrintWriter writer = response.getWriter();
	            String text;
	            while ((text = reader.readLine()) != null) {
	                writer.println(text + "</br>");
	            }
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
