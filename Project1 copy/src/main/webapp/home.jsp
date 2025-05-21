<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quiz App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f4f8;
            text-align: center;
            padding-top: 100px;
        }
        .container {
            background: #ffffff;
            padding: 40px;
            margin: auto;
            width: 400px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }
        h2 {
            color: #333333;
        }
        input[type="submit"] {
            padding: 10px 25px;
            font-size: 16px;
            border: none;
            background-color: #3498db;
            color: white;
            border-radius: 8px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Welcome to the Quiz App</h2>
        <form action="quiz" method="get">
            <input type="submit" value="Start Quiz">
        </form>
    </div>
</body>
</html>
