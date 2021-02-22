package com.example.ServletSession.first;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "firstIndex", value = "/index")
public class CookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/first/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String n=req.getParameter("name");
        out.print("Welcome "+n);

        Cookie ck=new Cookie("uname",n);//creating cookie object
        resp.addCookie(ck);//adding cookie in the response

        //creating submit button
        out.print("<form action='servlet2' method='post'>");
        out.print("<input type='submit' value='go'>");
        out.print("</form>");

        out.close();
    }
}
