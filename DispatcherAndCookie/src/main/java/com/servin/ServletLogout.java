package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletLogout extends HttpServlet{
  
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter();
    	RequestDispatcher rd = req.getRequestDispatcher("Link.html");
    	rd.include(req, res);
    	Cookie ck = new Cookie("username","");
    	ck.setMaxAge(0);
    	res.addCookie(ck);
    	out.print("<h1>you are successfully logged out</h1>");    	    	
    }
    
}