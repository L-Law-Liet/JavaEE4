package com.example.ServletSession.second;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Second2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            //Getting the value from the hidden field
            String n = request.getParameter("uname");
            out.print("Hello " + n);

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}