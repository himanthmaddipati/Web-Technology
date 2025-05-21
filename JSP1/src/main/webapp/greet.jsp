<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting Page</title>
</head>
<body>
<%
    String name = request.getParameter("username");
    if (name != null && !name.trim().isEmpty()) {
%>
    <h2>Hello, <%= name %>! Welcome to JSP programming.</h2>
<%
    } else {
%>
    <h2>No name entered. Please go back and try again.</h2>
<%
    }
%>
</body>
</html>
