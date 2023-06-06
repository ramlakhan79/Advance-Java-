package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.parser.Cookie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Servlet2 extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    jakarta.servlet.http.Cookie[] ck=request.getCookies();
    for(int i=0;i<ck.length;i++) {
    	out.print("<br><h1>Hello "+ck[i].getValue()+" Welcome Back to Sistec</h1>" );
    }   
    
    //String name;
	//name = request.getParameter("userName");		
	
	//out.print("<h1>Hello "+name +" Welcome Back to Sistec</h1>");
	out.print("<h1>Thank You</h1>"); 
	out.print("<h1><a href='index.html' >Go Back </a></h1>");
          
    }  
      
  
}  
