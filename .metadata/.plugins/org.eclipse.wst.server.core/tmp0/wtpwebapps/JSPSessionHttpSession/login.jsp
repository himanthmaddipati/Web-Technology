<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<html>
<head><title>Login Page</title></head>
<body>
<h2>Login</h2>
<form method="post">
    Enter your name: <input type="text" name="username" required>
    <input type="submit" value="Login">
</form>

<%
    String name = request.getParameter("username");
    if (name != null && !name.isEmpty()) {
        session.setAttribute("username", name);
        response.sendRedirect("welcome.jsp");
    }
%>
</body>
</html>
