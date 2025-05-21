<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="com.himanth.Student" scope="session"/>
<jsp:setProperty name="student" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Result</h1>
	Roll No:<jsp:getProperty property="rollno" name="student"/>
	Name: <jsp:getProperty property="name" name="student"/>
	Marks: <jsp:getProperty property="marks" name="student"/>
</body>
</html>