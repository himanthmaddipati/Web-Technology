<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Delete Cookie</title></head>
<body>
<h2>Delete Cookie</h2>

<%
    Cookie[] cookies = request.getCookies();
    boolean found = false;

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("username")) {
                c.setMaxAge(0); // Expire immediately
                response.addCookie(c);
                found = true;
                break;
            }
        }
    }

    if (found) {
        out.println("<p style='color:green;'>Cookie deleted successfully.</p>");
    } else {
        out.println("<p style='color:red;'>No cookie found to delete.</p>");
    }
%>

<p><a href="set_cookie.jsp">Go to Set Cookie Page</a></p>
</body>
</html>
