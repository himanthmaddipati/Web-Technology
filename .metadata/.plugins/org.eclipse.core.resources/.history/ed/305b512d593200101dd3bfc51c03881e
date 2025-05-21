package com.quizapp;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SubmitServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/quiz";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Chicken65";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int score = 0;

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT * FROM questions";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            int questionCount = 1;
            while (resultSet.next()) {
                int correctOption = resultSet.getInt("correct_option");
                String userAnswerStr = request.getParameter("question" + questionCount);
                if (userAnswerStr != null) {
                    int userAnswer = Integer.parseInt(userAnswerStr);
                    if (userAnswer == correctOption) {
                        score++;
                    }
                }
                questionCount++;
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            throw new ServletException("MySQL JDBC Driver not found.", e);
        } catch (SQLException e) {
            throw new ServletException("Database error", e);
        }

        request.setAttribute("score", score);
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }
}

