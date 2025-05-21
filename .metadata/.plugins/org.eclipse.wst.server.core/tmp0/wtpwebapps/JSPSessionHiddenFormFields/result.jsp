<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Step 3: Final Result</title></head>
<body>
<h2>Student Details</h2>

<%
    // Retrieve roll, name, and marks from the previous pages
    String roll = request.getParameter("roll");
    String name = request.getParameter("name");
    String marks = request.getParameter("marks");
%>

<p><strong>Roll No:</strong> <%= roll %></p>
<p><strong>Name:</strong> <%= name %></p>
<p><strong>Marks:</strong> <%= marks %></p>

</body>
</html>
