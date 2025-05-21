<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<html>
<head><title>Logout</title></head>
<body>
<h2>Logout</h2>

<%

    if (session != null) {
        session.invalidate();
        out.println("<p style='color:green;'>You have been logged out successfully.</p>");
    } else {
        out.println("<p>No active session found.</p>");
    }
%>

<p><a href="login.jsp">Login Again</a></p>
</body>
</html>
