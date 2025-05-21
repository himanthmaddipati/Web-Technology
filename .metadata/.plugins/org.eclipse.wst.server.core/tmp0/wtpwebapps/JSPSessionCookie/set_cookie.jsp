<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Set Cookie</title></head>
<body>
<h2>Enter Your Name</h2>
<form method="post">
    Name: <input type="text" name="username" required>
    <input type="submit" value="Submit">
</form>

<%
    String name = request.getParameter("username");
    if (name != null) {
        // Encode to handle special characters
        name = java.net.URLEncoder.encode(name, "UTF-8");
        Cookie cookie = new Cookie("username", name);
        cookie.setMaxAge(60 * 60); // 1 hour
        response.addCookie(cookie);
        out.println("<p style='color:green;'>Cookie set successfully!</p>");
%>
        <p><a href="read_cookie.jsp">Go to Welcome Page</a></p>
<%
    }
%>
</body>
</html>
