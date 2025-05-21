package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Step1Servlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String rollno = req.getParameter("rollno");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<form action='step2' method='post'>");
        out.println("Enter Name: <input type='text' name='name' required />");
        out.println("<input type='hidden' name='rollno' value='" + rollno + "' />");
        out.println("<input type='submit' value='Next' />");
        out.println("</form></body></html>");
    }
}
