<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Employee Records</title>
    <style>
        table, th, td { border: 1px solid black; padding: 8px; border-collapse: collapse; }
    </style>
</head>
<body>
<h2>Employee Records</h2>
<%
    String url = "jdbc:mysql://localhost:3306/emp";
    String username = "root";
    String password = "Chicken65";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM employees");

        out.println("<table>");
        out.println("<tr><th>ID</th><th>Name</th><th>Salary</th></tr>");
        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("emp_name") + "</td>");
            out.println("<td>" + rs.getDouble("salary") + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }
%>
<p><a href="insert_employee.jsp">Insert Another Employee</a></p>
</body>
</html>
