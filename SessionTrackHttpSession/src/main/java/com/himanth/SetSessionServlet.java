package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class SetSessionServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("username");
        HttpSession session = request.getSession(); // create session if doesn't exist
        session.setAttribute("username", name);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Session started for " + name + "</h3>");
        out.println("<a href='getSession'>Get Session</a><br>");
        out.println("<a href='invalidateSession'>Invalidate Session</a>");
        out.println("</body></html>");
    }
}
