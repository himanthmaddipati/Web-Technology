package com.quizapp;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 8+
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "Chicken65");

            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
            ps.setString(1, username);
            ps.setString(2, password); // In real apps, hash the password

            int result = ps.executeUpdate();

            if (result > 0) {
                out.println("<!DOCTYPE html>");
                out.println("<html><head><title>Success</title><style>");
                out.println("body { font-family: Arial, sans-serif; background-color: #f0f8ff; display: flex; align-items: center; justify-content: center; height: 100vh; margin: 0; }");
                out.println(".box { background-color: #fff; padding: 40px; border-radius: 10px; box-shadow: 0 4px 10px rgba(0,0,0,0.1); text-align: center; }");
                out.println("h3 { color: green; margin-bottom: 20px; }");
                out.println("a { text-decoration: none; background-color: #007BFF; color: white; padding: 10px 20px; border-radius: 5px; }");
                out.println("a:hover { background-color: #0056b3; }");
                out.println("</style></head><body>");
                out.println("<div class='box'>");
                out.println("<h3>Registration Successful!</h3>");
                out.println("<a href='login.jsp'>Login Now</a>");
                out.println("</div></body></html>");
            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html><head><title>Failure</title><style>");
                out.println("body { font-family: Arial, sans-serif; background-color: #fff0f0; display: flex; align-items: center; justify-content: center; height: 100vh; margin: 0; }");
                out.println(".box { background-color: #fff; padding: 40px; border-radius: 10px; box-shadow: 0 4px 10px rgba(0,0,0,0.1); text-align: center; }");
                out.println("h3 { color: red; margin-bottom: 20px; }");
                out.println("</style></head><body>");
                out.println("<div class='box'>");
                out.println("<h3>Registration Failed.</h3>");
                out.println("</div></body></html>");
            }                  

            conn.close();
        } catch (SQLIntegrityConstraintViolationException e) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Registration Failed</title><style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #fff0f0; display: flex; align-items: center; justify-content: center; height: 100vh; margin: 0; }");
            out.println(".box { background-color: #fff; padding: 40px; border-radius: 10px; box-shadow: 0 4px 10px rgba(0,0,0,0.1); text-align: center; }");
            out.println("h3 { color: red; margin-bottom: 20px; }");
            out.println("a { text-decoration: none; background-color: #007BFF; color: white; padding: 10px 20px; border-radius: 5px; }");
            out.println("a:hover { background-color: #0056b3; }");
            out.println("</style></head><body>");
            out.println("<div class='box'>");
            out.println("<h3>Username already exists.</h3>");
            out.println("<a href='register.jsp'>Try Again</a>");
            out.println("</div></body></html>");
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}