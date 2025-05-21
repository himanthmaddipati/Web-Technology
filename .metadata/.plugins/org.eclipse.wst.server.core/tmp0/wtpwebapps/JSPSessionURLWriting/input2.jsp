<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Step 2: Enter Marks</title></head>
<body>
<h2>Enter Marks</h2>

<%
    String roll = request.getParameter("roll");
    String name = request.getParameter("name");
    // Encode the name in case it has spaces or special characters
    String encodedName = java.net.URLEncoder.encode(name, "UTF-8");
%>

<form action="result.jsp?roll=<%= roll %>&name=<%= encodedName %>" method="get">
    Marks: <input type="text" name="marks" required><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>

