package com.servinter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class ServInterFaceExample implements Servlet{

		ServletConfig config;
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Servlet is Initialized");
		
	}
	
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My Servlet 1.0";
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet is destroyed");	
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		out.print("<html> <body>");
		out.print("<b>Servlet by Implementing Servlet InterFace</b>");	
		out.print("</body></html>");
		
	}	
}