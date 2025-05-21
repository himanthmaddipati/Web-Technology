package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Step3Servlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String rollno = req.getParameter("rollno");
        String name = req.getParameter("name");
        String marks = req.getParameter("marks");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h2>Session Tracking using Hidden Fields</h2>");
        out.println("<p>Roll No: " + rollno + "</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Marks: " + marks + "</p>");
        out.println("</body></html>");
    }
}
