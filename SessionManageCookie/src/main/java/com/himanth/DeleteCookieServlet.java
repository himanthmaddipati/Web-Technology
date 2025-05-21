package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class DeleteCookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    // Overwrite and set Max-Age to 0 to delete
                    c.setMaxAge(0);
                    response.addCookie(c);
                }
            }
        }

        out.println("<html><body>");
        out.println("<h3>Cookie deleted successfully.</h3>");
        out.println("<a href='index.html'>Set Cookie Again</a>");
        out.println("</body></html>");
    }
}
