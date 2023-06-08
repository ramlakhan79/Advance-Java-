package com.servin;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Servlet2 extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    Cookie[] ck=request.getCookies();
    String name = "";
    boolean f = false;
    for(int i=0;i<ck.length;i++) {
    	String skey = ck[i].getName();
    	if(skey.equals("userName")) {
    		name=ck[i].getValue();
    		f=true;
    		break;
    	}     
    }   
    if(f==true) {
    	out.print("<br><h1>Hello "+name+" Welcome Back to Sistec</h1>" );
    }
    else {
    	out.print("<br><h1>You Are New User </h1>" );    	
    }   
  
	out.print("<h1>Thank You</h1>"); 
	out.print("<h1><a href='index.html' >Go To Home Page </a></h1>");
          
    }  
      
  
}  
