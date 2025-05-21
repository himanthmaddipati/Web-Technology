//import java.io.*;
//
//import jakarta.servlet.*;
//
//import jakarta.servlet.http.*;
//
//import java.sql.*;
//
//public class QueryServlet extends HttpServlet {
//
//
//	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//
//		res.setContentType("text/html");
//
//		PrintWriter out = res.getWriter();
//
//		String query = req.getParameter("query");
//
//		if (query == null || query.trim().isEmpty()) {
//
//			out.println("<h3>Error: Query parameter is missing</h3>");
//
//			return;
//
//		}
//
//		try (
//
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Chicken65");
//
//				Statement stmt = con.createStatement()
//
//		) {
//
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			boolean hasResult = stmt.execute(query);
//
//			if (hasResult) {
//
//				ResultSet rs = stmt.getResultSet();
//
//				ResultSetMetaData md = rs.getMetaData();
//
//				int cols = md.getColumnCount();
//
//				out.println("<table border='1'><tr>");
//
//				for (int i = 1; i <= cols; i++)
//					out.print("<th>" + md.getColumnName(i) + "</th>");
//
//				out.println("</tr>");
//
//				while (rs.next()) {
//
//					out.println("<tr>");
//
//					for (int i = 1; i <= cols; i++)
//						out.print("<td>" + rs.getString(i) + "</td>");
//
//					out.println("</tr>");
//
//				}
//
//				out.println("</table>");
//
//			} else {
//
//				out.println("<h3>Update Count: " + stmt.getUpdateCount() + "</h3>");
//
//			}
//
//		} catch (Exception e) {
//
//			out.println("<h3>Error:</h3><pre>" + e.getMessage() + "</pre>");
//
//		}
//
//	}
//
//}


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class QueryServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String query = req.getParameter("query");
		
		if(query == null || query.trim().isEmpty())
		{
			out.println("Query is missing");
			return;
			
		}
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Chicken65");
				Statement stmt = con.createStatement();
				)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			boolean hasResult = stmt.execute(query);
			
			if(hasResult) {
				ResultSet rs = stmt.getResultSet();
				ResultSetMetaData md = rs.getMetaData();
				
				int cols = md.getColumnCount();
				
				out.println("<table border='1'><tr>");
				for(int i=1;i<=cols;i++)
				{
					out.print("<th>"+md.getColumnName(i)+"</th>");
				}
				out.print("</tr>");
				
				while(rs.next())
				{
					out.print("<tr>");
					for(int i=1;i<=cols;i++)
					{
						out.print("<td>"+rs.getString(i)+"</td>");
						
					}
					out.print("</tr>");
				}
				out.print("</table>");
			}
			else {
				out.println("Update Count:"+stmt.getUpdateCount());
			}
		}
		catch(Exception e) {
			out.print(e.getMessage());
		}
	}
}