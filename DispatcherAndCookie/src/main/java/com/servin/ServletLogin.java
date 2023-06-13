package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        request.getRequestDispatcher("Link.html").include(request, response);  
          
        String uname=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("1234")){  
            out.print("You are successfully logged in!");  
            out.print("<br>Welcome, "+uname);  
              
            Cookie ck=new Cookie("name",uname);  
            response.addCookie(ck);  
        }else{  
            out.print("sorry, username or password error!");  
            request.getRequestDispatcher("Login.html").include(request, response);  
        }  
          
        out.close();  
    }  
  
}  