<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Read Cookie</title></head>
<body>
<h2>Welcome Page</h2>

<%
    Cookie[] cookies = request.getCookies();
    String username = null;

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("username")) {
                username = java.net.URLDecoder.decode(c.getValue(), "UTF-8");
                break;
            }
        }
    }

    if (username != null) {
        out.println("<h3>Hello, " + username + "!</h3>");
        out.println("<p><a href='delete_cookie.jsp'>Delete Cookie</a></p>");
    } else {
        out.println("<p>No cookie found. <a href='set_cookie.jsp'>Set your name</a></p>");
    }
%>
</body>
</html>
