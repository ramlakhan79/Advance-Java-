package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SendRedirectMethod extends HttpServlet{
	protected void doPost(HttpServletRequest request , HttpServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name ;
		name= request.getParameter("nm");
		res.sendRedirect("https://www.google.com/search?q="+name);
	}
}
