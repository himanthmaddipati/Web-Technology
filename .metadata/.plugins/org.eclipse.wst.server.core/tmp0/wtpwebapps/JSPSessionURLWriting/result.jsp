<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Result</title></head>
<body>
<%
    String roll = request.getParameter("roll");
    String name = request.getParameter("name");
    String marks = request.getParameter("marks");

    String decodedName = (name != null) ? java.net.URLDecoder.decode(name, "UTF-8") : "N/A";
%>
<h2>Student Result</h2>
<p>Roll No: <%= roll %></p>
<p>Name: <%= decodedName %></p>
<p>Marks: <%= marks %></p>

</body>
</html>
