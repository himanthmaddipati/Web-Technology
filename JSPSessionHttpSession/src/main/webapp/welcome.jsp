<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<html>
<head><title>Welcome Page</title></head>
<body>
<h2>Welcome Page</h2>

<%
 // Don't create if not exists
    if (session != null && session.getAttribute("username") != null) {
        String name = (String) session.getAttribute("username");
        out.println("<h3>Hello, " + name + "!</h3>");
%>
        <p><a href="logout.jsp">Logout</a></p>
<%
    } else {
        out.println("<p>Session not found. Please <a href='login.jsp'>login</a> again.</p>");
    }
%>
</body>
</html>
