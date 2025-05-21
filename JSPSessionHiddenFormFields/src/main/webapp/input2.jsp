<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Step 2: Enter Marks</title></head>
<body>
<h2>Enter Marks</h2>

<%
    // Retrieve roll and name from the first page
    String roll = request.getParameter("roll");
    String name = request.getParameter("name");
%>

<form action="result.jsp" method="post">
    Marks: <input type="text" name="marks" required><br><br>

    <!-- Pass roll and name as hidden fields to the next page -->
    <input type="hidden" name="roll" value="<%= roll %>">
    <input type="hidden" name="name" value="<%= name %>">

    <input type="submit" value="Submit">
</form>
</body>
</html>
