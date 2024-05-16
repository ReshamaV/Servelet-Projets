

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class marks
 */
@WebServlet("/marks")
public class marks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public marks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw;
		response.setContentType("text/html");
		pw=response.getWriter();
		
		String rollno=request.getParameter("rollno");
		//int i=Integer.parseInt(rollno);
		String name=request.getParameter("name");
		String marks=request.getParameter("marks");
		//int j=Integer.parseInt(marks);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Reshamacv@19");
			String query="Insert into marksheets123 values (?,?,?)";    
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1,rollno);
            pstmt.setString(2,name);
            pstmt.setString(3,marks);
            int x=pstmt.executeUpdate();    
            
            if(x==1)    
            {    
            pw.println("Values Inserted Successfully");    
            }    
                
        }    
        catch(Exception e)    
        {    
                e.printStackTrace();    
        }    
            
            
        pw.close();    
		}
	

}
