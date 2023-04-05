package com.HttpServ;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpServExam extends HttpServlet {

	ServletConfig config;
public void init(ServletConfig config) throws ServletException 
{
	// TODO Auto-generated method stub
	this.config=config;
	System.out.println("Servlet is Initialized");
	
}

protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.print("<html><head><title>HttpServlet</title></head> <body>");
	out.print("<b>Servlet by Extending HttpServlet Class</b>");	
	out.print("</body></html>");
}
public void destroy() {
	System.out.println("Server Destroyed");
}
}
