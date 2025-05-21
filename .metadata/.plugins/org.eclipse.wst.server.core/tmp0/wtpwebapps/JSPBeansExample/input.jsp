<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Enter Student Details</title></head>
<body>
    <h2>Student Grade Entry</h2>
    <form action="process.jsp" method="post">
        Roll No: <input type="text" name="rollNo" required><br><br>
        Name: <input type="text" name="name" required><br><br>
        Marks: <input type="number" name="marks" min="0" max="100" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
