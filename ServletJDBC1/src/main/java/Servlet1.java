import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String salary = req.getParameter("salary");
		
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Chicken65");
				)
		{
			String query = "insert into employees values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,Integer.parseInt(id));
			ps.setString(2, name);
			ps.setInt(3, Integer.parseInt(salary));
			int rows = ps.executeUpdate();
			out.println(""+rows+" were inserted");
		}
		catch(Exception e) {
			out.print(e.getMessage());
		}
	}
}
