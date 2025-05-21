<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #a1c4fd, #c2e9fb);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            animation: fadeIn 0.8s ease-in;
        }
    
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }
    
        .login-container {
            background-color: #fff;
            padding: 40px;
            border-radius: 16px;
            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.1);
            width: 360px;
            text-align: center;
        }
    
        h2 {
            margin-bottom: 20px;
            color: #333;
            font-weight: 600;
        }
    
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 12px;
            margin: 12px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 15px;
            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.05);
            transition: border-color 0.3s ease, box-shadow 0.3s ease;
        }
    
        input[type="text"]:focus,
        input[type="password"]:focus {
            border-color: #5b9bd5;
            box-shadow: 0 0 6px rgba(91, 155, 213, 0.3);
            outline: none;
        }
    
        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #5b9bd5;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
    
        input[type="submit"]:hover {
            background-color: #4a8bc2;
        }
    
        .form-note {
            font-size: 14px;
            color: #666;
            margin-top: 18px;
        }
    
        .form-note a {
            color: #5b9bd5;
            text-decoration: none;
        }
    
        .form-note a:hover {
            text-decoration: underline;
        }
    
        .logo {
            font-size: 28px;
            font-weight: bold;
            color: #5b9bd5;
            margin-bottom: 15px;
        }
    </style>    
</head>
<body>
    <div class="login-container">
        <div class="logo">QuizApp Login</div>
        <h2>Welcome Back</h2>
        <form method="post" action="login">
            <input type="text" name="username" placeholder="Username" required />
            <input type="password" name="password" placeholder="Password" required />
            <input type="submit" value="Login" />
        </form>
        <div class="form-note">
            Don't have an account? <a href="register.jsp">Register</a>
        </div>
    </div>
</body>
</html>
