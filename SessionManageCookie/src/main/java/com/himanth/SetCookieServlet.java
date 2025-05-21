package com.himanth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.net.URLEncoder;

public class SetCookieServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String name = request.getParameter("username");
        // ✅ Encode the value to prevent illegal characters like space
        String encodedName = URLEncoder.encode(name, "UTF-8");

        Cookie userCookie = new Cookie("username", encodedName);
        userCookie.setMaxAge(60 * 60); // 1 hour
        response.addCookie(userCookie);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Cookie set successfully!</h3>");
        out.println("<a href='readcookie'>Read Cookie</a><br>");
        out.println("<a href='deletecookie'>Delete Cookie</a>");
        out.println("</body></html>");

    }
}

