<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Employee</title>
</head>
<body>
<h2>Insert New Employee</h2>

<form method="post" action="insert_employee.jsp">
    ID: <input type="number" name="id" required><br><br>
    Name: <input type="text" name="emp_name" required><br><br>
    Salary: <input type="number" step="0.01" name="salary" required><br><br>
    <input type="submit" value="Insert">
</form>

<%
    String idStr = request.getParameter("id");
    String name = request.getParameter("emp_name");
    String salaryStr = request.getParameter("salary");

    if (idStr != null && name != null && salaryStr != null) {
        int id = Integer.parseInt(idStr);
        double salary = Double.parseDouble(salaryStr);

        String url = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String password = "Chicken65";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement("INSERT INTO employees (id, emp_name, salary) VALUES (?, ?, ?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                out.println("<p style='color:green;'>Employee inserted successfully!</p>");
            } else {
                out.println("<p style='color:red;'>Insertion failed.</p>");
            }
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }
    }
%>

<p><a href="view_employee.jsp">View All Employees</a></p>
</body>
</html>
