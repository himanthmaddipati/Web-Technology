<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <style>
        * {
            box-sizing: border-box;
        }
    
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #89f7fe, #66a6ff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
    
        .register-container {
            background-color: #ffffff;
            padding: 40px 30px;
            border-radius: 16px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            animation: fadeIn 0.8s ease-in-out;
        }
    
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(30px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    
        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
            font-size: 24px;
        }
    
        input[type="text"],
        input[type="password"],
        select {
            width: 100%;
            padding: 12px;
            margin: 12px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 15px;
            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.05);
            transition: border-color 0.3s, box-shadow 0.3s;
        }
    
        input[type="text"]:focus,
        input[type="password"]:focus,
        select:focus {
            border-color: #66a6ff;
            box-shadow: 0 0 6px rgba(102, 166, 255, 0.3);
            outline: none;
        }
    
        input[type="submit"] {
            width: 100%;
            padding: 14px;
            background: linear-gradient(to right, #4facfe, #00f2fe);
            color: #fff;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: background 0.3s ease;
        }
    
        input[type="submit"]:hover {
            background: linear-gradient(to right, #00c6ff, #0072ff);
        }
    
        .form-note {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
            color: #555;
        }
    
        @media (max-width: 480px) {
            .register-container {
                padding: 30px 20px;
            }
        }
    </style>    
</head>
<body>
    <div class="register-container">
        <h2>Create Account</h2>
        <form method="post" action="register">
            <input type="text" name="username" placeholder="Username" required />
            <input type="password" name="password" placeholder="Password" required />
            <input type="submit" value="Register"/>
        </form>
        <div class="form-note">
            Already have an account? <a href="login.jsp">Login</a>
        </div>
    </div>
</body>
</html>
