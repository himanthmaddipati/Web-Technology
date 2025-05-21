<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
    <style>
        table, th, td {
            border: 1px solid black;
            padding: 8px;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h2>Employee Records</h2>
<%
    // JDBC connection variables
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
        out.println("<tr><th>ID</th><th>Employee Name</th><th>Salary</th></tr>");

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
        if (rs != null) try { rs.close(); } catch (SQLException ignored) {}
        if (stmt != null) try { stmt.close(); } catch (SQLException ignored) {}
        if (conn != null) try { conn.close(); } catch (SQLException ignored) {}
    }
%>
</body>
</html>
