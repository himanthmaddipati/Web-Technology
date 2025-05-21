package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Step2Servlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String rollno = req.getParameter("rollno");
        String name = req.getParameter("name");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<form action='step3' method='post'>");
        out.println("Enter Marks: <input type='text' name='marks' required />");
        out.println("<input type='hidden' name='rollno' value='" + rollno + "' />");
        out.println("<input type='hidden' name='name' value='" + name + "' />");
        out.println("<input type='submit' value='Submit' />");
        out.println("</form></body></html>");
    }
}

