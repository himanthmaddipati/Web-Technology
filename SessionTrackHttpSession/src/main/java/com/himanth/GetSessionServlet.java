package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class GetSessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false); // don't create if not exists
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        if (session != null) {
            String name = (String) session.getAttribute("username");
            out.println("<h3>Welcome back, " + name + "</h3>");
        } else {
            out.println("<h3>No active session</h3>");
        }
        out.println("</body></html>");
    }
}
