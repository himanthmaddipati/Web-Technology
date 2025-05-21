package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.net.URLDecoder;

public class ReadCookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        out.println("<html><body>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    String decoded = URLDecoder.decode(c.getValue(), "UTF-8");
                    out.println("<h3>Welcome back, " + decoded + "</h3>");
                }
            }
        } else {
            out.println("<h3>No cookies found</h3>");
        }

        out.println("<a href='deletecookie'>Delete Cookie</a>");
        out.println("</body></html>");
    }
}
