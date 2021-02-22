package com.example.ServletSession.first;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet2", value = "/servlet2")
public class SecondServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie ck[]=request.getCookies();
            out.print("Hello "+ck[0].getValue());
            out.close();

        }catch(Exception e){System.out.println(e);}
    }
}
