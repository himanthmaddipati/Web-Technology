<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quiz Result</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #eaf6f6;
            text-align: center;
            padding-top: 100px;
        }
        .result-box {
            background: #ffffff;
            padding: 40px;
            margin: auto;
            width: 400px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }
        h2 {
            color: #2c3e50;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: white;
            background-color: #27ae60;
            padding: 10px 20px;
            border-radius: 8px;
            font-size: 16px;
            transition: background-color 0.3s;
        }
        a:hover {
            background-color: #219150;
        }
    </style>
</head>
<body>
    <div class="result-box">
        <h2>Your Score: ${score}</h2>
        <a href="home.jsp">Take Quiz Again</a>
    </div>
</body>
</html>
