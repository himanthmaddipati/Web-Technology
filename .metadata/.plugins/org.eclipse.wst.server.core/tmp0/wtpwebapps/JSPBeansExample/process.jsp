<%@ page import="com.himanth.Student" %>
<jsp:useBean id="student" class="com.himanth.Student" scope="session"/>
<jsp:setProperty name="student" property="*" />

<html>
<head><title>Processed Student</title></head>
<body>
    <h2>Student Result</h2>
    Roll No: <jsp:getProperty name="student" property="rollNo"/><br>
    Name: <jsp:getProperty name="student" property="name"/><br>
    Marks: <jsp:getProperty name="student" property="marks"/><br>
    Grade: <jsp:getProperty name="student" property="grade"/><br><br>

    <% 
        if (student.isPass()) {
    %>
        <span style="color:green;">Congratulations! You passed.</span>
    <% 
        } else {
    %>
        <span style="color:red;">Sorry, you have failed.</span>
    <% 
        } 
    %>
    <br><br>
    <a href="input.jsp">Enter Another Student</a>
</body>
</html>
